# 💳 Cajero Automático en Kotlin

Este es un programa en **Kotlin** que simula el funcionamiento de un **cajero automático**. Permite validar números de tarjeta mediante el **algoritmo de Luhn**, autenticar al usuario con un **PIN** y realizar operaciones bancarias como **consulta de saldo, retiros e ingresos de dinero**.

## 🚀 Características
- ✅ **Validación de tarjeta** usando el **algoritmo de Luhn**.
- 🔒 **Autenticación con PIN** para mayor seguridad.
- 💰 **Consulta de saldo** disponible en la cuenta.
- 🏧 **Retiros con verificación de saldo suficiente**.
- 📥 **Depósitos de dinero** con actualización en tiempo real.
- 📌 **Interfaz de usuario basada en consola** con un menú interactivo.

## 📜 Requisitos
- Tener **Kotlin** instalado en tu sistema.
- Usar un **entorno de ejecución de Kotlin** como IntelliJ IDEA o la terminal con `kotlinc`.

## 📦 Instalación y Uso
1. **Clona este repositorio** o descarga el archivo:
   ```sh
   git clone https://github.com/tu-usuario/cajero-automatico-kotlin.git
   cd cajero-automatico-kotlin

2. **Compila y ejecuta el programa** en la terminal:
   ```sh
   kotlinc main.kt -include-runtime -d cajero.jar
   java -jar cajero.jar
   ```
   O si usas **IntelliJ IDEA**, simplemente abre el archivo `main.kt` y ejecuta `main()`.

## 🎮 Cómo Usarlo
1. **Ingresa un número de tarjeta válido** (ejemplo: `4539148803436467`).
2. **Introduce el PIN correcto** (ejemplo: `1234`).
3. **Selecciona una operación**:
    - `1` → Consultar saldo.
    - `2` → Retirar dinero.
    - `3` → Ingresar dinero.
    - `4` → Salir del sistema.
4. **Interactúa con el cajero** según lo que necesites.

## 🛠 Tecnologías Usadas
- **Kotlin** para la lógica del programa.
- **Algoritmo de Luhn** para la validación de tarjetas.
- **Interfaz CLI** (Command Line Interface) para la interacción con el usuario.

## 📌 Ejemplo de Uso
```plaintext
💳 Bienvenido al Cajero Automático 💳
Ingrese su número de tarjeta: 4539148803436467
Ingrese su PIN: ****
🔹 Menú del Cajero Automático 🔹
1. Consultar saldo
2. Retirar dinero
3. Ingresar dinero
4. Salir
Seleccione una opción: 1
💰 Su saldo actual es: $1500.00
```

## ✨ Contribuciones
¡Las contribuciones son bienvenidas! Si tienes mejoras o nuevas funcionalidades, no dudes en hacer un **fork** y enviar un **pull request**. 🚀

---
📌 **Desarrollado por [Antonio Zamora](https://github.com/antoniozamora2002)**