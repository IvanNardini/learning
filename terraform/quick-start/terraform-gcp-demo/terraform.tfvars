project = "inardini-playground"
credentials_file = "./inardini-playground-a2c42af9891c.json"
region = "us-central1"

# Example of list
cidrs = [ "10.0.0.0/16", "10.1.0.0/16" ]

machine_types = {
  dev  = "f1-micro"
  test = "n1-highcpu-32"
  prod = "n1-highcpu-32"
}

