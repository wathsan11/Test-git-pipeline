provider "aws" {
  region = "us-east-1"   # Change to your desired AWS region
}

resource "aws_instance" "example" {
  ami           = "ami-0157af9aea2eef346"  # Replace with your AMI ID
  instance_type = "t3.micro"                # Change instance type as needed

  tags = {
    Name = "ExampleInstance"
  }
}
