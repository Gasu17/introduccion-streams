# Actividad: Java Streams (DAM1) — Kata + Tests (Maven)

En esta actividad vas a practicar **Streams en Java** resolviendo una serie de katas (Strings, Numbers, Doubles y Objetos) **sin usar `for` ni `while`**.  
Tu trabajo consiste en **implementar los métodos** que ahora mismo lanzan `UnsupportedOperationException("TODO")` hasta que **todos los tests pasen en verde**.

> 🔥 Regla principal: **en los ejercicios NO uses `for` ni `while`.**

---

## Teoría (obligatorio leer antes de empezar)

La teoría y ejemplos paso a paso están aquí (Notion):

**Streams en Java — Guía paso a paso (actividad)**  
[Guía elaborada con Notion](https://standing-hoodie-a6a.notion.site/Streams-en-Java-Gu-a-paso-a-paso-actividad-2c791519db6d80638ddddbeb5471a482?pvs=73)

---

## Antes de empezar: haz un fork del repositorio

1. En GitHub, pulsa **Fork** para crear una copia del repositorio en tu cuenta.
2. Clona **tu fork** en tu ordenador.
3. Trabaja y haz commits en tu fork.
4. Cuando termines, entrega el enlace a tu fork (y/o abre un Pull Request si se pide).

> Importante: **no trabajes directamente sobre el repositorio original**, siempre sobre tu fork.

---

## Objetivo

- Aprender a leer un enunciado y convertirlo en una “receta” de Stream:  
  **seleccionar → transformar → ordenar → recortar → resultado final**
- Practicar operaciones como:
  - `filter`, `map`, `distinct`, `sorted`, `limit`
  - `mapToInt`, `mapToDouble` + `sum`, `average`, `max`, `min`
  - `findFirst`, `orElse`, `anyMatch`
  - BONUS: `flatMap` (aplanar listas)

---

## Estructura del proyecto

### Katas (código a implementar)
- `src/main/java/com/ivancorrales/streams/strings/StringStreamsKata.java`
- `src/main/java/com/ivancorrales/streams/numbers/NumberStreamsKata.java`
- `src/main/java/com/ivancorrales/streams/numbers/DoubleStreamsKata.java`
- `src/main/java/com/ivancorrales/streams/objects/ObjectStreamsKata.java`
- `src/main/java/com/ivancorrales/streams/objects/Song.java` *(clase de apoyo)*

### Tests (corrigen automáticamente)
- `src/test/java/com/ivancorrales/streams/strings/StringStreamsKataTest.java`
- `src/test/java/com/ivancorrales/streams/numbers/NumberStreamsKataTest.java`
- `src/test/java/com/ivancorrales/streams/numbers/DoubleStreamsKataTest.java`
- `src/test/java/com/ivancorrales/streams/objects/ObjectStreamsKataTest.java`

---

## Cómo trabajar (paso a paso)

1. Abre la kata que toque (por ejemplo `StringStreamsKata`).
2. Lee el JavaDoc del método: ahí está el enunciado.
3. Piensa los pasos que necesitas (ejemplos):
   - “Quedarme con los positivos” → `filter(n -> n > 0)`
   - “Sin repetidos” → `distinct()`
   - “Orden descendente” → `sorted(Comparator.reverseOrder())`
   - “Top 3” → `limit(3)`
   - “Suma” → `mapToInt(...)` + `sum()`
4. Implementa el método.
5. Ejecuta los tests.
6. Repite hasta que esté todo verde ✅

---

## Ejecutar los tests

### Opción A: Terminal
```bash
mvn clean test
```

### Opción B: IntelliJ / Eclipse
- Ejecuta los tests desde la carpeta `src/test/java`.
- Si un test falla, lee el mensaje: te está diciendo qué salida esperaba.

---

## Reglas y recomendaciones

### ✅ Permitido
- Encadenar operaciones de stream.
- Usar `Comparator`, `Math.round`, `String::method`.
- Usar `toList()` (si tu versión de Java lo soporta).

### ❌ Prohibido
- `for`, `while`, `do-while`
- Modificar las listas originales (`paises`, `puntos`, `playlist`, etc.)
- Cambiar los tests para “hacer trampas”

### 💡 Consejos
- Un stream “no se ejecuta” hasta la operación terminal (por ejemplo `toList()`, `sum()`, `count()`…).
- Un stream **no se puede reutilizar**: si lo consumes, crea otro.
- Si necesitas un valor por defecto cuando no hay resultados:
  - `average().orElse(0.0)`
  - `max().orElse(0)`
  - `findFirst().orElse("N/A")`

---

## Orden recomendado de katas

1. **Strings** (filter/map/distinct/sorted + algún `flatMap`)
2. **Numbers (Integer)** (IntStream, average, max/min + `flatMap` con listas de listas)
3. **Doubles** (DoubleStream + redondeo + `flatMap`)
4. **Objects** (comparators, mapToInt/mapToDouble, joining)

---

## Si aparece un error de versión de Java (muy típico)

Si ves algo como:

`UnsupportedClassVersionError ... class file version 62.0 ... only recognizes up to 61.0`

Significa:
- Se compiló con un Java más nuevo (62 = Java 18)
- Pero estás ejecutando con Java 17 (61)

Solución:
- Compilar y ejecutar con la misma versión (recomendado: **Java 17**)

Comprueba:
```bash
java -version
mvn -version
```

---

## Entrega

- Deben pasar **todos los tests** (`mvn test` en verde).
- No se aceptan soluciones con bucles clásicos.

¡Cuando lo tengas todo en verde, actividad completada! ✅

