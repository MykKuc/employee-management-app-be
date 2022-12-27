# Employee Management Application

## This is not a final Product !! I am adding new features and fixing bugs!!

## Hosted Application (AWS)

**Domain Names: employeemanagementapp.com or www.employeemanagementapp.com**

**This Application is hosted on AWS. Frontend is hosted inside S3 Bucket and delivered using CloudFront and AWS Certificate Manager, Domain name bought and registered using Amazon Route 53. 
Backend is deployed on EC2 Instances (AMI: Ubuntu 22.04 LTS; Instance type: t3.nano) and load balanced using Application Load Balancer (ALB). 
MySQL database is running on Amazon RDS. Secrets of Database connection are storred inside AWS Secrets Manager.**

![Alt text](Employee%20Management%20App%20Infrastructure.png "Infrastructure Scheme of Application.")

**I had also deployed the application using Amazon Elastic Container Service and Amazon Elastic Container Registry.
After creating Dockerfile I created Docker Image and pushed it to my Amazon ECR repository.
After that I have used ECS to create and run Docker containers created from my Docker image.
You can find the Docker image at: https://hub.docker.com/repository/docker/mykoliux/employee_management_app**

## The Purpose of Application

The purpose of this Application is to make work for HR easier and let them manage Human Resources in a more convenient way.

## Viewing Employee Information

One of the functionalities of Employee Management Application is viewing the information about a particular employee group or just about a single employee.


## Adding the employee to the database of the employees

New Employee can be added to the database by entering certain needed information about the employee.
