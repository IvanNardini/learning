variable "project" {
  type = string
}

variable "credentials_file" { }

variable "region" {
  default = "europe-west1"
}

variable "zone" {
  default = "europe-west1-b"
}

variable "web_instance_count" {
  type    = number
  default = 1
}

variable "cidrs" { 
  default = [] 
}

variable "environment" {
  type    = string
  default = "dev"
}

variable "machine_types" {
  type    = map
  default = {
    dev  = "f1-micro"
    test = "n1-highcpu-32"
    prod = "n1-highcpu-32"
  }
}
