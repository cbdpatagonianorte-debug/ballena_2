# Contexto del Proyecto: Franca, la ballena austral
Estamos construyendo una experiencia inmersiva centrada en la ballena franca austral. El objetivo principal es concientizar sobre esta especie mediante tecnología de vanguardia.

## Sistema de Diseño: "Abyssal Glow"
El diseño visual debe transmitir el ecosistema oceánico basándose en las siguientes reglas:
* **Profundidad tonal:** Uso de gradientes a 135°.
* **Asimetría intencional y fluidez:** Ausencia de líneas divisorias sólidas.
* **Efectos visuales:** Uso intensivo de `backdrop-blur` (20px).
* **Tipografía:** "Noto Serif" exclusiva para el storytelling.

## Tarea Principal y Arquitectura
Diseñar e implementar la estructura base de la aplicación en Android usando Kotlin. Se debe aplicar **Clean Architecture** (patrón recomendado por Google) dividiendo el código en UI, Dominio y Datos, garantizando un sistema escalable, testeable y robusto.

### 1. Capa de Datos (Data Layer)
* **SSOT (Single Source of Truth):** Implementar una fuente de confianza única para los datos de migración y registros sonoros.
* **Repositorios:** Deben gestionar la lógica de negocio de datos y resolver conflictos entre fuentes locales (Room / DataStore) y remotas (APIs de seguimiento satelital).

### 2. Capa de Dominio (Domain Layer)
* **Casos de Uso (Use Cases):** Responsabilidad única (ej. `GetWhaleMigrationUseCase`, `GenerateOceanicSoundscapeUseCase`, `ProcessGeminiInteractionUseCase`).
* **Concurrencia:** Asegurar que todos los procesos de esta capa sean seguros para el subproceso principal (*main-thread safe*) usando Coroutines/Flows.

### 3. Capa de UI (Interfaz de Usuario)
* Utilizar **Jetpack Compose** para renderizar las pantallas.
* Seguir estrictamente el flujo de datos unidireccional (**UDF**) gestionando el estado mediante `ViewModels` y `StateFlow`.

#### Pantallas Principales a Implementar:
1.  **ExploreTheOceanScreen:** Mapa inmersivo con capas de persistencia para funcionamiento *offline*.
2.  **SongsOfTheDeepInterface:** Interfaz generativa que usa ViewModels para retener el estado dinámico de las ondas sonoras.
3.  **MarineMasterpiecesStudio:** Laboratorio de arte con IA que procese prompts visuales siguiendo principios de ética y transparencia.
4.  **SpeakWithGeminiInterface:** Chatbot conversacional integrado mediante el Model Context Protocol (MCP) para descubrir herramientas dinámicamente en el servidor.

## Requerimientos de IA, Seguridad y LLMOps
* **Human-in-the-loop:** La interfaz conversacional debe permitir al usuario ajustar y mejorar las respuestas generadas por la IA.
* **Privacidad (Seguridad por Diseño - SdB):** Protección estricta en la carga de archivos del historial clínico o datos sensibles del usuario.
* **LLMOps:** Prever una arquitectura (monitoreo y logs) que permita medir el rendimiento de los modelos de IA y controlar los costos de la API.

## Entregables Esperados del Agente
1.  Esquema de clases y dependencias usando Inyección de Dependencias (**Hilt**).
2.  Código base para los `ViewModels` y `Screens` en Kotlin/Compose que respeten las especificaciones de "Abyssal Glow".
3.  Plan de pruebas unitarias exclusivo para la capa de Dominio.