# Spring Boot Product Pipeline

Este proyecto es un ejercicio educativo construido con Java y Spring Boot que implementa el **patrón de diseño Pipeline**. Se encarga de procesar un producto a través de una serie de pasos encadenados que lo validan y transforman antes de que pueda ser persistido o utilizado.

---

## 📌 Características principales

- ✅ Implementación del patrón Pipeline en Java puro.
- 🔍 Validaciones manuales de campos (nombre, precio, stock).
- 🔐 Generación automática de un código de producto (UUID reducido).
- 🔤 Formateo del nombre a Title Case.
- 🌱 Código limpio, extensible y modular.
- 🧪 Preparado para pruebas y extensión con base de datos si se desea.

---

## 🧩 Estructura del proyecto

```
com.pipeline
├── controller         → Controlador REST
├── dto                → Clases de transferencia de datos (Request)
├── model              → Modelo de dominio (Product)
├── pipeline           → Interfaz del patrón y ejecutor del pipeline
├── steps              → Implementaciones de los pasos del pipeline
└── service            → Lógica que construye y ejecuta el pipeline
```

---

## 🚀 Cómo ejecutar el proyecto

### Requisitos:

- Java 17 o superior
- Maven o usar el wrapper `./mvnw`
- IDE recomendado: IntelliJ o VS Code

### Comandos:

```bash
./mvnw spring-boot:run
```

> También se puede ejecutar desde la clase `ProductPipelineApplication.java`.

---

## 📬 Endpoint disponible

### POST /api/products

**Request JSON:**

```json
{
  "name": "camiseta puma",
  "price": 7500,
  "stock": 15
}
```

**Response JSON:**

```json
{
  "name": "Camiseta puma",
  "price": 7500,
  "stock": 15,
  "generatedCode": "e8a9f3d2"
}
```

---

## 🏗️ Posibles mejoras

- Persistencia en base de datos con JPA/Hibernate.
- Validaciones asíncronas o externas.
- Manejo de excepciones más detallado con `@ControllerAdvice`.
- Test unitarios para cada paso del pipeline.

---

## 🧑‍💻 Autor

- **Joaquín Riveros**  
- Ejercicio educativo – patrón Pipeline en Spring Boot
