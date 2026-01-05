pipeline{
	agent any
	
	parameters{
		choice(name: 'Browser', choices: ['chrome', 'firefox', 'edge'], description: 'Select Browser)
		string(name: 'URL', defaultValue: 'http://10.0.0.40/jenkins/', description: 'Enter URL')
		string(name: 'Username', defaultValue: 'chirag.batra', description: 'Enter Jenkins Username')
		string(name: 'Password', defaultValue: 'chirag18', description: 'Enter Jenkins Password')
		string(name: 'BE_Branch', defaultValue: 'version/I2-0_Converge_2024', description: 'Enter Backend Branch')
		string(name: 'FE_Branch', defultValue: 'versionI2-0_Converge_2024', description: 'Enter Frontend Branch')
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
		
		stage('Build'){
			steps{
				bat 'mvn clean compile -Dskiptests'
			}
		}
		
		stage('Run Tests'){
			steps{
				bat """
				mvn test ^
				-Dbrowser=${params.BROWSER} ^
				-Dtesting.url=$[params.URL] ^
				-Dusername=${params.USERNAME} ^
				-Dpassword=${params.PASSWORD} ^
				-Dbackend.branch=${params.BE_BRANCH}
				-Dfrontend.branch=${params.FE_BRANCH}
			}
		}
	}
	
	post{
		always{
			echo 'Pipeline Finished'
			junit 'target/surefire-reports/*.xml' 
		}success{
			echo 'Tests passed'
		}failure{
			echo 'Tests failed'
		}
	}
}