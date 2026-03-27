# Simulador de Crédito por Libranza

Aplicación fullstack para simular créditos por libranza.

## Tecnologías
- **Backend:** Java 17, Spring Boot, H2 Database
- **Frontend:** Angular 21

## Cómo correr el proyecto

### Backend
1. Abrir carpeta `backend` en IntelliJ
2. Correr `BackendApplication.java`
3. El servidor queda en `http://localhost:8080`

### Frontend
1. Abrir carpeta `libranza-frontend` en VS Code
2. Ejecutar `ng serve`
3. Abrir `http://localhost:4200`

## Funcionalidades
- Simulación de crédito con fórmula de amortización francesa
- Tabla de pagos detallada cuota por cuota
- Validaciones: monto máximo $100.000.000 y plazo máximo 84 meses
- Tests unitarios en JUnit
```

Guarda con **Ctrl + S** y luego ejecuta en la terminal:
```
git add .
git commit -m "README agregado"
git push
