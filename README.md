# Proyecto Final — Guía rápida de Git

Guía sencilla para trabajar en equipo con este proyecto.

---

## 0. Crear cuenta en GitHub

1. Entra a [https://github.com/login](https://github.com/login) → Inicia sesión con Gmail o crea una cuenta nueva.

> Sin cuenta de GitHub no podrás subir ni bajar cambios del proyecto.

---

## 1. Instalar Git en Windows

1. Descarga Git desde [https://git-scm.com/download/win](https://git-scm.com/download/win)
2. Ejecuta el instalador → siguiente, siguiente, siguiente (opciones por defecto está bien).
3. Abre **Git Bash** y configura tu nombre y correo (los que usas en GitHub):

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu-correo@ejemplo.com"
```

> Esto solo se hace una vez. Para verificar:
> ```bash
> git config --global --list
> ```

---

## 2. Clonar el proyecto (solo la primera vez)

```bash
# Descarga el proyecto a tu máquina
git clone https://github.com/ruby-calderon/proyecto_GrupoB.git


# Entra a la carpeta del proyecto
cd proyecto_GrupoB                  
```

---

## 3. Antes de empezar a trabajar (bajar cambios)

```bash
git pull                            # Descarga los últimos cambios del equipo
```

> Hazlo siempre antes de empezar a codear para evitar conflictos.

---

## 4. Trabajar en tus cambios

Edita los archivos que necesites en Eclipse o tu editor favorito.

---

## 5. Ver qué archivos cambiaste

```bash
git status                          # Muestra archivos modificados y nuevos
```

---

## 6. Preparar los archivos para subir (stage)

```bash

# Agrega TODOS los cambios que tienes pensados subir a github
git add -A   

# o si solo quieres agregar un archivo específico:
git add ruta/del/archivo.java       # Agrega solo ese archivo
```

---

## 7. Crear un commit (guardar cambios localmente)

```bash
git commit -m "Descripción corta de lo que hiciste"
```

> Escribe mensajes claros, por ejemplo: `"Agregar validación en DialogoVenta"`

---

## 8. Subir los cambios al repositorio remoto

```bash
git push origin master                 # Sube tus commits al repo en GitHub
```

---

## Resumen del flujo diario

```
1. git pull                  ← Bajar lo último del equipo
2.  ... editar archivos ...
3. git status                ← Ver qué cambió
4. git add -A                ← Preparar cambios
5. git commit -m "mensaje"   ← Guardar cambios localmente
6. git push origin master    ← Subir cambios al remoto
```