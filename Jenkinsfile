pipeline{
	agent any
	
	parameters{
		choice(name: 'Browser', choices: ['chrome', 'firefox', 'edge'], description: 'Select Browser')
		string(name: 'URL', defaultValue: 'http://10.0.0.40/jenkins/', description: 'Enter URL')
		string(name: 'Username', defaultValue: 'chirag.batra', description: 'Enter Jenkins Username')
		string(name: 'Password', defaultValue: 'chirag18', description: 'Enter Jenkins Password')
		string(name: 'BE_Branch', defaultValue: 'version/I2-0_Converge_2024', description: 'Enter Backend Branch')
		string(name: 'FE_Branch', defaultValue: 'versionI2-0_Converge_2024', description: 'Enter Frontend Branch')
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
				bat 'mvn clean compile -DskipTests'
			}
		}
		
		stage('Run Tests'){
			steps{
				bat """
				mvn test ^
				-Dbrowser=${params.Browser} ^
				-Dtesting.url=$[params.URL] ^
				-Dusername=${params.Username} ^
				-Dpassword=${params.Password} ^
				-Dbackend.branch=${params.BE_Branch} ^
				-Dfrontend.branch=${params.FE_Branch}
				"""
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