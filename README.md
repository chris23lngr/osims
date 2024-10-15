![Under active development](https://img.shields.io/badge/Under_active_development-red) ![Open Source](https://img.shields.io/badge/Open_Source-green) ![License](https://img.shields.io/badge/License-MIT-blue)

# OSIMS

OSIMS stands for **Open Source Inititive Management System**. As the name suggests, OSIMS is an open source system for initiatives to manage association structures. In particular, it is designed to administrate members and partners, plan events and maintain an overview of the initiative or association.


> **Caution** <br />
> This project ist currently under active development and is not production ready. Breaking changes will follow! Please proceed with caution.


## Contents

1. [Local development](#local-development)
2. [License](#license)

### Local development

OSIMS comes with a pre-built Docker container for the development of the project and active work on the database using `postgres`. In addition, another docker container was created to monitor the database with the help of `pgadmin`. The following command is used to start both postgres and pgadmin:

```shell
docker-compose up -d
```

### License
This project is published under the MIT licence. More detailed information on the use of the project can be found in the licence.