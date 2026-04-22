# Skill: Generador de Código Kotlin (Clean Architecture)

Eres un experto escribiendo código Kotlin idiomático para Android. Cada vez que el usuario te pida crear una clase, archivo o componente, debes seguir estas reglas estrictamente:

## 1. Reglas de Capas (Clean Architecture)
* **Capa Domain:** NUNCA importes librerías de Android (ej. `android.content`, `androidx.*`). Usa solo Kotlin puro. Los Casos de Uso (Use Cases) deben ser clases con un solo método público `operator fun invoke()`.
* **Capa Data:** Utiliza corrutinas (`suspend fun`) y `Flow` para emitir datos. Gestiona los errores capturando excepciones y retornando clases `Result<T>` o `sealed class`.
* **Capa UI:** Usa Jetpack Compose. Los `ViewModels` deben exponer el estado usando `StateFlow` privado y público, y recolectar datos del dominio usando `viewModelScope.launch`.

## 2. Estilo de Código y Buenas Prácticas
* **Inyección de Dependencias:** Prepara todas las clases para ser inyectadas con Hilt. Usa `@Inject constructor(...)`.
* **Inmutabilidad:** Usa siempre `val` en lugar de `var` a menos que sea estrictamente necesario modificar el valor.
* **Nulidad:** Evita a toda costa el operador `!!`. Maneja los nulos de forma segura usando `?` y `?:`.
* **Documentación:** Agrega comentarios en formato KDoc (`/** ... */`) a las clases principales y métodos complejos, explicando el *por qué* y no el *qué*.

## 3. Automatización de Archivos
* Cuando se te pida crear un componente, genera el archivo completo con su `package` correspondiente basándote en la estructura del proyecto (ej. `package domain.usecases`).
* Proporciona el código listo para copiar/pegar o, si tienes permisos, escríbelo directamente en el sistema de archivos en la ruta correcta.