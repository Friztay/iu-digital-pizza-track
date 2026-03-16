# 🍕 IU-DIGITAL-PIZZA-TRACK

### Simulador de Gestión de Pedidos para Pizzería con Pilas (Undo / Redo)

---

## 📌 Descripción del Proyecto

**IU-DIGITAL-PIZZA-TRACK** es un simulador de gestión de pedidos para una pizzería desarrollado en **Java**, cuyo objetivo principal es aplicar el concepto de **estructuras de datos tipo pila (Stack)** mediante la implementación de un sistema de **Undo / Redo** para el manejo de pedidos.

El sistema permite registrar pedidos, cancelarlos y gestionar el historial de acciones realizadas, utilizando pilas para almacenar y recuperar estados anteriores del sistema.

Este proyecto fue desarrollado con fines académicos para fortalecer el aprendizaje de **estructuras de datos, programación orientada a objetos y trabajo colaborativo mediante control de versiones**.

---

## 🎯 Objetivo del Proyecto

Que el estudiante comprenda el concepto de **pila y su estructura lógica**, siendo capaz de aplicarlo en un **simulador de gestión de pedidos (Undo/Redo)** para una pizzería, implementado en Java.

La actividad busca evaluar la capacidad del estudiante para:

* Comprender e implementar la estructura de datos **Pila (Stack)**.
* Aplicar operaciones fundamentales como **Push, Pop y Peek**.
* Combinar estructuras de datos como **arreglos y listas enlazadas**.
* Implementar conceptos de **programación orientada a objetos**.
* Trabajar colaborativamente en equipo.
* Aplicar buenas prácticas de **control de versiones con Git y GitHub**.

---

## 🧠 Conceptos Aplicados

Durante el desarrollo del proyecto se aplican los siguientes conceptos:

* Estructuras de datos **Pila (Stack)**
* Gestión de historial mediante **Undo / Redo**
* Programación Orientada a Objetos (POO)
* Manejo de excepciones
* Encapsulación y abstracción
* Separación de responsabilidades por capas
* Uso de estructuras:

  * **Arreglos**
  * **Listas enlazadas**

---

## ⚙️ Funcionalidades del Sistema

El sistema permite realizar las siguientes operaciones:

* Registrar nuevos pedidos de pizza.
* Cancelar pedidos existentes.
* Visualizar pedidos pendientes.
* Visualizar pedidos cancelados.
* Deshacer la última operación realizada (**Undo**).
* Rehacer una operación previamente deshecha (**Redo**).
* Simular el historial de operaciones mediante pilas.

Estas funcionalidades permiten comprender cómo funcionan los sistemas que manejan **historial de acciones**, como editores de texto o sistemas de control de cambios.

---

## 🏗️ Estructura del Proyecto

La estructura actual del proyecto es la siguiente:

```
IU-DIGITAL-PIZZA-TRACK/
│
├── src/
│   │
│   ├── models/
│   │   ├── NodoModel.java
│   │   ├── PedidosCancelados.java
│   │   ├── PedidosPendientes.java
│   │   ├── PilaPedidosModel.java
│   │   └── PizzaModel.java
│   │
│   ├── services/
│   │   ├── GestionPedidosService.java
│   │   └── MenuService.java
│   │
│   └── Main.java
│
├── bin/                 # Archivos compilados del proyecto
├── .vscode/             # Configuración del editor
├── .gitignore
└── README.md
```

---

## 📂 Descripción de Componentes

### 📦 `models`

Contiene las **estructuras de datos y modelos del sistema**.

* **NodoModel.java**
  Implementación de un nodo utilizado para la estructura de pila.

* **PilaPedidosModel.java**
  Implementación de la pila que almacena los pedidos y gestiona las operaciones de inserción y eliminación.

* **PizzaModel.java**
  Representa el modelo de una pizza dentro del sistema.

* **PedidosPendientes.java**
  Maneja la estructura que contiene los pedidos activos o pendientes.

* **PedidosCancelados.java**
  Maneja la estructura que contiene el historial de pedidos cancelados.

---

### ⚙️ `services`

Contiene la **lógica de negocio del sistema**.

* **GestionPedidosService.java**
  Maneja las operaciones relacionadas con los pedidos: registrar, cancelar, deshacer y rehacer.

* **MenuService.java**
  Gestiona la interacción con el usuario a través del menú del sistema.

---

### 🚀 `Main.java`

Es el **punto de entrada de la aplicación**, donde se inicia la ejecución del programa y se invoca el menú principal.

---

## ▶️ Cómo ejecutar el proyecto

### 1️⃣ Clonar el repositorio

```bash
git clone https://github.com/Friztay/iu-digital-pizza-track.git
```

---

### 2️⃣ Entrar al directorio del proyecto

```bash
cd IU-DIGITAL-PIZZA-TRACK
```

---

### 3️⃣ Compilar los archivos Java

```bash
javac src/**/*.java
```

o manualmente:

```bash
javac src/models/*.java src/services/*.java src/Main.java
```

---

### 4️⃣ Ejecutar el programa

```bash
java src.Main
```

---

## 🧑‍💻 Tecnologías Utilizadas

* **Java**
* **Git**
* **GitHub**
* **Programación Orientada a Objetos**

---

## 🔧 Herramientas de Desarrollo

El proyecto fue desarrollado utilizando:

* Editor de código: **Visual Studio Code**
* Control de versiones: **Git**
* Repositorio remoto: **GitHub**

---

## 📚 Contexto Académico

Este proyecto forma parte de una actividad académica enfocada en el aprendizaje de **estructuras de datos**, específicamente la **pila (Stack)** y su aplicación práctica en sistemas que manejan historial de operaciones.

---

## 📄 Licencia

Proyecto desarrollado **con fines educativos y académicos**.

Video sustentacion **https://drive.google.com/file/d/15Lte3ZXV3NC-4h0QnpQ-slLJeeWkHYxd/view?usp=sharing**