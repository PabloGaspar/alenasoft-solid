# Bitacora de cambios #
## Cambios generales ##
* Se removieron los magic strings y numbers agregando variables constantes en diferentes clases
* Se reimplemento el método UpdateQuality en la clase GildedRose
* Se agregaron una estructura de heriancia de clases a patir de Item 
## Interface QualityUpdatable ##
* Se agregó esta interface para segregar esta tarea comun pero con diferente comportamiento
* Cada clase tiene la responsabilidad de implementar el methodo **updateQuality** dependiendo sus especifidades
* El método **getMaxQuality** se define cúal es el valor máximo que puede tener la variable **Quality**
* El método **getMinQuality** se define cúal es el valor mínimo que puede tener la variable **Quality**
* Los dos métodos mencionados arriba pueden ser sobre escritos en las clases especificas 
para tener valores máximo y mínimo  distintos 
## Clase ItemDecorator ##
* El proposito de esta clase es la de ser empleada como una clase decoradora para añadir funcionalidad a la clase base **Item**
* Por defecto esta clase emplea los methodos definidos en la clase **Item**
* Se tiene un template method llamado **updateQualityTemplate**  ya que se tiene un compartimito definido en todas las clases derivadas que es
    *  Actualizar **quality** del item usando **updateQuality** este methodo se invoca usando polimorfismo
    * Controlar los limites de **quality** usando **controlQualityLimits** obteniedo polimorficamente los valores máximos y mínimos
    * Decrementar el valor de **SellIn** llamando a **updateSellIn**
## Clases derivadas de ItemDecorator ##
* Se tienen diferentes clases que heredan de **ItemDecorator** e implementan los métodos específicos de la interface **QualityUpdatable**
* Estas clases son
    * AgedBrieItem
    * BackstagePassItem
    * ConjuredItem
    * SulfurasItem
* Para agregar  un nuevo tipo de item o feature basta con agregar una nueva clase que extienda de **ItemDecorator** e implemente 
sus methodos específicos
## Clase fábrica ItemFactory ##
* Esta clase tiene el proposito de crear clases decoradas a partir del un **Item** y el string en la variable **Name**
* Lo malo de esta clase es que para agregar otro tipo de item se debe modificar el método **createItemDecorator**
## Clase GildedRose ##
* Esta clase convierte la lista de items en una lista de items decorados para poder trabajar de una forma mas sencilla el método 
**updateQuality**



