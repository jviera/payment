# payment
Notificación de pagos

## Problema
Tenemos un partner el cual nos manda notificación de pago, el endpoint que
tenemos con este partner no debe de demorar en responder más de 20 ms esto
para cumplir 50 TPS (transaction per seconds) que nos exige el partner, tomando
en cuenta que cuando recibimos la notificación de pago, nosotros tenemos que
usar unos APIs en JSON que demoran en contestarnos 50ms.
¿Cómo podemossolucionar este problema para cumplir con los 20ms?
Explica cómo lo harías, qué tecnologías utilizarías y si es posible muestra la
parte crucial de este código

## Solución
Realmente existen muchas formas de resolver este problema, usando un BUS, un MQ, Hilos, Futures ó en el caso que voy a presentar usar la anotación @Async de Spring, la cuál ejecuta el API en segundo plano despues de las validaciones pertinentes.
