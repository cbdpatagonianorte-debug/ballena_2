# Archivo: skills/guardar_datos.py

def guardar_en_base_de_datos(datos: dict, tabla: str) -> str:
    """
    Guarda un diccionario de datos en la tabla especificada.
    """
    try:
        # Validamos que los datos no estén vacíos
        if not datos:
            return "Error: No hay datos para guardar."

        # Simulación de conexión (Aquí conectarías con supabase-py)
        print(f"[Sistema] Conectando a la tabla '{tabla}'...")
        print(f"[Sistema] Insertando: {datos}")
        
        # En una implementación real usarías algo como:
        # supabase.table(tabla).insert(datos).execute()
        
        return f"Éxito: Los datos han sido guardados en la tabla '{tabla}'."

    except Exception as e:
        # El error str(e) captura el mensaje específico del fallo
        return f"Error: No se pudo guardar la información. Detalle: {str(e)}"

# Ejemplo de cómo se llamaría a esta función:
# resultado = guardar_en_base_de_datos({"nombre": "Config_App", "version": 1.0}, "configuraciones")
# print(resultado)