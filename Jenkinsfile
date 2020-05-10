pipeline{
	agent any
	stages{
		stage('Build Application'){
			steps{
				sh 'mvn clean package'
			}
			post{
				success{
					echo "Now archiving the Artifacts..."
					archiveArtifacts artifacts: '**/*.war'
					echo "Artifacts archived"
				}
			}		
		}
		stage('Creating Docker Image'){
			steps{
				sh 'docker build . -t javawebproject:1.0'
			}
		}
	}
}
