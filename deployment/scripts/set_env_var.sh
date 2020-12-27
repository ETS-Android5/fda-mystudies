#!/bin/bash
#This script sets environment variables that are used throughout the deployment

# PREFIX is a name you choose for your deployment that will be prepended to various
# directories, cloud resources and URLs (for example this could be `mystudies`)
export PREFIX=

# ENV is a label you choose that will be appended to PREFIX in your directories
# and cloud resources (for example this could be `dev`, `test` or `prod`)
export ENV=

# GIT_ROOT is the local path to the root of your cloned FDA MyStudies repository
export GIT_ROOT=

# LOCATION is the loctaion you specified for your deployment in
# deployment.hcl, for example `us-central1`
export LOCATION=

# DOMAIN is the domain you will be using for your URLs (for example, 
# `${PREFIX}.your_company_name.com` or `${PREFIX}.your_medical_center.edu`)
export DOMAIN=

# ENGINE_CONFIG and MYSTUDIES_TEMPLATE do not need to be changed unless
# you have moved these files within your GitHub repo
export ENGINE_CONFIG=${GIT_ROOT}/deployment/deployment.hcl
export MYSTUDIES_TEMPLATE=${GIT_ROOT}/deployment/mystudies.hcl