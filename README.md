<div align="center">

# ⚙️ Camunda API Backend — Service Salud

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
<img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"/>
<img src="https://img.shields.io/badge/Camunda_BPM-FC5D0D?style=for-the-badge&logo=camunda&logoColor=white"/>
<img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
<img src="https://img.shields.io/badge/H2_Database-004088?style=for-the-badge&logoColor=white"/>

**🌍 [English](#-english-version) · 🇪🇸 [Español](#-versión-en-español)**

<br/>

*REST API con motor Camunda BPM embebido — modela, ejecuta y gestiona procesos BPMN automatizados.*

</div>

---

## 🇪🇸 Versión en Español

### 📝 Descripción

**Service Salud** es una API REST desarrollada con **Java + Spring Boot** que integra el motor de flujos de trabajo **Camunda BPM**. Diseñada para modelar, ejecutar y gestionar procesos de negocio automatizados (BPMN), actúa como la capa lógica principal que se comunica con el frontend de la aplicación.

> 🔗 **Proyecto completo:** este backend funciona en conjunto con [FrontApiCamunda](https://github.com/HEO-80/FrontApiCamunda) — interfaz web del panel de usuario.

---

### ✨ Características Principales

- 🔄 **Motor Camunda integrado** — gestión completa del ciclo de vida de procesos BPMN desde Spring Boot
- 🔌 **API REST** — endpoints para iniciar procesos, completar tareas humanas y consultar estados de flujos
- 🗄️ **Base de datos embebida** — H2 Database para despliegue local rápido sin configuración externa
- 📦 **Maven** — gestión de dependencias y empaquetado simplificado

---

### 🛠️ Tech Stack

| Área | Tecnología |
|:---|:---|
| Lenguaje | Java 11+ |
| Framework | Spring Boot |
| Motor BPMN | Camunda BPM |
| Build Tool | Maven |
| Base de datos | H2 (embebida) |

---

### 🏗️ Estructura del Proyecto
```
apiCamunda/
└── service-salud/
    ├── src/
    │   ├── main/
    │   │   ├── java/           # Controladores, servicios y delegados
    │   │   └── resources/
    │   │       ├── *.bpmn      # Diagramas de proceso BPMN
    │   │       └── application.properties
    │   └── test/
    └── pom.xml                 # Dependencias Maven
```

---

### 🚀 Instalación y Ejecución Local

**Prerrequisitos**
- [JDK 11+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)
- [Camunda Modeler](https://camunda.com/download/modeler/) *(opcional — para visualizar archivos `.bpmn`)*

**1. Clonar el repositorio**
```bash
git clone https://github.com/HEO-80/apiCamunda.git
cd service-salud
```

**2. Compilar el proyecto**
```bash
mvn clean install
```

**3. Ejecutar la aplicación**
```bash
mvn spring-boot:run
```

La API estará disponible en:
```
http://localhost:8080/engine-rest
```

Panel de Camunda Cockpit:
```
http://localhost:8080/camunda/app/cockpit
```

---

### 🔗 Proyecto Completo (Fullstack)

| Repo | Rol | Tech |
|:---|:---|:---|
| `apiCamunda` *(este)* | 🔧 Backend — motor BPMN y API REST | Java / Spring Boot / Camunda |
| [`FrontApiCamunda`](https://github.com/HEO-80/FrontApiCamunda) | 🖥️ Frontend — panel de usuario | Web |

---

### 🧑‍💻 Autor

**Héctor Oviedo** — Backend Developer

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/hectorob/)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/HEO-80)

---
---

## 🇬🇧 English Version

### 📝 Description

**Service Salud** is a REST API developed with **Java + Spring Boot** that integrates the **Camunda BPM** workflow engine. Designed to model, execute and manage automated business processes (BPMN), it serves as the core logic layer communicating with the application's frontend.

> 🔗 **Full project:** this backend works together with [FrontApiCamunda](https://github.com/HEO-80/FrontApiCamunda) — the user panel web interface.

---

### ✨ Key Features

- 🔄 **Embedded Camunda engine** — full BPMN process lifecycle management from Spring Boot
- 🔌 **REST API** — endpoints to start processes, complete human tasks and query workflow states
- 🗄️ **Embedded database** — H2 Database for fast local deployment without external configuration
- 📦 **Maven** — simplified dependency management and packaging

---

### 🛠️ Tech Stack

| Area | Technology |
|:---|:---|
| Language | Java 11+ |
| Framework | Spring Boot |
| BPMN Engine | Camunda BPM |
| Build Tool | Maven |
| Database | H2 (embedded) |

---

### 🚀 Local Setup

**Prerequisites**
- [JDK 11+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)
- [Camunda Modeler](https://camunda.com/download/modeler/) *(optional — to visualize `.bpmn` files)*

**1. Clone the repository**
```bash
git clone https://github.com/HEO-80/apiCamunda.git
cd service-salud
```

**2. Build the project**
```bash
mvn clean install
```

**3. Run the application**
```bash
mvn spring-boot:run
```

API available at:
```
http://localhost:8080/engine-rest
```

Camunda Cockpit panel:
```
http://localhost:8080/camunda/app/cockpit
```

---

### 🔗 Full Stack Project

| Repo | Role | Tech |
|:---|:---|:---|
| `apiCamunda` *(this)* | 🔧 Backend — BPMN engine & REST API | Java / Spring Boot / Camunda |
| [`FrontApiCamunda`](https://github.com/HEO-80/FrontApiCamunda) | 🖥️ Frontend — user panel | Web |

---

### 🧑‍💻 Author

**Héctor Oviedo** — Backend Developer

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/hectorob/)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/HEO-80)

---

<div align="center">
  <sub>Desarrollado con ☕ por <strong>Héctor Oviedo</strong> · Zaragoza, España</sub>
</div>
