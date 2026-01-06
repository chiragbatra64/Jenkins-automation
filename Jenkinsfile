pipeline{
	agent any
	
	parameters{
		choice(name: 'BROWSER', choices: ['chrome', 'firefox', 'edge'], description: 'Select Browser')
		string(name: 'URL', defaultValue: 'http://10.0.0.40/jenkins/', description: 'Enter URL')
		string(name: 'USERNAME', defaultValue: 'chirag.batra', description: 'Enter Jenkins Username')
		string(name: 'PASSWORD', defaultValue: 'chirag18', description: 'Enter Jenkins Password')
		string(name: 'BE_BRANCH', defaultValue: 'version/I2-0_Converge_2024', description: 'Enter Backend Branch')
		string(name: 'FE_BRANCH', defaultValue: 'versionI2-0_Converge_2024', description: 'Enter Frontend Branch')
	}
	
	tools{
		jdk 'JDK21'
		maven 'Maven3'
	}
	
	stages{
		
		stage('Checkout Code'){
			steps{
				checkout scm
			}
		}
		
		stage('Prepare Methods Regex') {
    		steps {
        		script {
            		// Convert comma-separated methods to regex: a,b,c -> a|b|c
            		env.METHODS_REGEX = params.METHODS.replaceAll('\\s+', '').replace(',', '|')
            		echo "Running methods regex: ${env.METHODS_REGEX}"
        		}
    		}
		}
		
		
		stage('Build'){
			steps{
				bat 'mvn clean compile -DskipTests'
			}
		}
		
		stage('Run Tests'){
			steps{
				bat """
				mvn test ^
				-Dbrowser=${params.BROWSER} ^
				-Dtesting.url=${params.URL} ^
				-Dusername=${params.USERNAME} ^
				-Dpassword=${params.PASSWORD} ^
				-Dbackend.branch=${params.BE_BRANCH} ^
				-Dfrontend.branch=${params.FE_BRANCH} ^
				-Dgroups="${params.METHODS}"
				"""
			}
		}
	}
	
	post{
		always{
			echo 'Pipeline Finished'
			junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
		}
		
		success{
			echo 'Tests passed'
		}
		
		failure{
			echo 'Tests failed'
		}
	}
}