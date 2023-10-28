<!DOCTYPE html>
<html>
<head>
    <title>Formulario de Registro de Empleado</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h2>Registro de Empleado</h2>
        <form method="post" action="ControladorEmpleado">
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Ingresa el nombre" required>
            </div>
            <div class="form-group">
                <label for="apellido">Apellido:</label>
                <input type="text" class="form-control" id="apellido" name="apellido" placeholder="Ingresa el apellido" required>
            </div>
            <div class="form-group">
                <label>Sexo:</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="sexo" id="sexoM" value="masculino">
                    <label class="form-check-label" for="sexoM">
                        Masculino
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="sexo" id="sexoF" value="femenino">
                    <label class="form-check-label" for="sexoF">
                        Femenino
                    </label>
                </div>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" name="email" id="email" placeholder="Ingresa el email" required>
            </div>
            <div class="form-group">
                <label for="fechaNacimiento">Fecha de Nacimiento:</label>
                <input type="date" class="form-control" name="fecha" id="fechaNacimiento" required>
            </div>
            <div class="form-group">
                <label for="telefono">Teléfono:</label>
                <input type="tel" class="form-control" name="telefono" id="telefono" placeholder="Ingresa el teléfono" required>
            </div>
            <div class="form-group">
                <label for="dni">DNI:</label>
                <input type="text" class="form-control" name="dni" id="dni" placeholder="Ingresa el DNI" required>
            </div>
            <button type="submit" class="btn btn-primary">Registrar Empleado</button>
        </form>
    </div>

    <!-- Agrega la referencia a Bootstrap JS y jQuery (opcional) para funcionalidad adicional -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
