# Camunda API Backend (Service Salud) ⚙️🏥

[ES]
**Service Salud** es una API REST desarrollada con **Java** y **Spring Boot** que integra el motor de flujos de trabajo de **Camunda BPM**. Este backend está diseñado para modelar, ejecutar y gestionar procesos de negocio automatizados (BPMN), sirviendo como la capa lógica principal que se comunica con el frontend de la aplicación.

[EN]
**Service Salud** is a REST API developed with **Java** and **Spring Boot** that integrates the **Camunda BPM** workflow engine. This backend is designed to model, execute, and manage automated business processes (BPMN), serving as the core logic layer that communicates with the application's frontend.

---

## ✨ Características Principales | Key Features

### [ES]
* **Motor Camunda Integrado:** Gestión completa de ciclos de vida de procesos BPMN directamente desde Spring Boot.
* **API REST:** Endpoints expuestos para iniciar procesos, completar tareas humanas y consultar el estado de los flujos.
* **Base de Datos Embebida:** Configurado con H2 Database para un despliegue local rápido y persistencia de datos de procesos.
* **Gestión de Dependencias:** Construido con Maven para una fácil integración y empaquetado.

### [EN]
* **Embedded Camunda Engine:** Full lifecycle management of BPMN processes directly from Spring Boot.
* **REST API:** Endpoints to start processes, complete human tasks, and query workflow states.
* **Embedded Database:** Configured with H2 Database for rapid local deployment and process data persistence.
* **Dependency Management:** Built with Maven for easy integration and packaging.

---

## 🛠️ Tecnologías Utilizadas | Tech Stack
* **Language:** Java 11+
* **Framework:** Spring Boot
* **BPMN Engine:** Camunda BPM
* **Build Tool:** Maven (`pom.xml`)
* **Database:** H2 (Local/Embedded)

---

## 🚀 Despliegue Local | Local Setup

### Prerrequisitos / Prerequisites
* Java Development Kit (JDK) instalado.
* Maven instalado.
* (Opcional) Camunda Modeler para visualizar o editar los archivos `.bpmn`.

### Instalación / Installation
1. Clonar el repositorio:

    git clone https://github.com/HEO-80/apiCamunda.git

2. Navegar al directorio del servicio:

    cd service-salud

3. Instalar dependencias y compilar el proyecto con Maven:

    mvn clean install

4. Ejecutar la aplicación Spring Boot:

    mvn spring-boot:run

5. Una vez iniciado, la API de Camunda estará disponible por defecto en:
   `http://localhost:8080/engine-rest`

---

## 🔗 Frontend Recomendado | Recommended Frontend
Este backend está diseñado para funcionar en conjunto con el panel de usuario. Puedes encontrar la interfaz web en el siguiente repositorio:
* [FrontApiCamunda (CarmSms)](https://github.com/HEO-80/FrontApiCamunda)

---

## ✒️ Autor | Author
**HEO-80** - *Backend Developer* - [LinkedIn](https://www.linkedin.com/in/tu-perfil)
