Design Patterns Projects

This project contains concrete Java implementations of  Design Patterns. The goal is to demonstrate code flexibility, scalability.
 Project Structure

The directory hierarchy follows the standard Java package naming conventions:
Plaintext

    |___DESIGN_PATTERN
            |____PATRON_DE_CONSTRUCTION
                         |___abstract_factory_pattern    
                         |___builder_pattern
                         |___factory_pattern
                         |___singletom_pattern
            |____PATRON_DE_STRUCTURATION
                         |___adapter_pattern
                                 |____example_sur_les_carre
                                 |____example_vente_vehicule
                         |___bridge_pattern
                         |___composite_pattern
                         |___decorator_pattern

How to Compile and Run

To ensure packages are resolved correctly, always execute commands from the root directory (DESIGN_PATTERN).

Creational Patterns

Abstract Factory:
    compile :	javac PATRON_DE_CONSTRUCTION/abstract_factory_pattern/*.java 
    run : 	java PATRON_DE_CONSTRUCTION.abstract_factory_pattern.Main


Builder :
    compile :	javac PATRON_DE_CONSTRUCTION/builder_pattern/*.java
    run : 	java PATRON_DE_CONSTRUCTION.builder_pattern.Main


Factory: 
    compile:	javac PATRON_DE_CONSTRUCTION/factory_pattern/*.java
    run :	java PATRON_DE_CONSTRUCTION.factory_pattern.Main


Singleton:
    compile:	javac PATRON_DE_CONSTRUCTION/singletom_pattern/*.java	
    run : java PATRON_DE_CONSTRUCTION.singletom_pattern.Main


Structural Patterns

Adapter (Square) :
    compile :	javac PATRON_DE_STRUCTURATION/adapter_pattern/example_sur_les_carre/*.java
    run : 	java PATRON_DE_STRUCTURATION.adapter_pattern.example_sur_les_carre.Main

Adapter (Vehicle) : 
    compile : 	javac PATRON_DE_STRUCTURATION/adapter_pattern/example_vente_vehicule/*.java 
	run : java PATRON_DE_STRUCTURATION.adapter_pattern.example_vente_vehicule.Main


Bridge :
compile : 	javac PATRON_DE_STRUCTURATION/bridge_pattern/*.java	
run : java PATRON_DE_STRUCTURATION.bridge_pattern.Main


Composite : 
    compile :javac PATRON_DE_STRUCTURATION/composite_pattern/*.java
    run :	java PATRON_DE_STRUCTURATION.composite_pattern.Main

    
Decorator : 
    compile :	javac PATRON_DE_STRUCTURATION/decorator_pattern/*.java
    run :	java PATRON_DE_STRUCTURATION.decorator_pattern.Main