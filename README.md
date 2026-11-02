# Object-Oriented Design Pattern Laboratory

This repository contains the practical work for an academic laboratory on
object-oriented analysis, design, UML modeling, and design-pattern
implementation in Java.

The course uses real-world software scenarios to connect written design work
with small, executable console applications. Each project follows the same
five-phase workflow:

1. **Requirement analysis** - define the problem, objectives, actors, system
   boundary, and requirements.
2. **Object identification** - classify entity, control, and boundary objects.
3. **CRC cards** - document class responsibilities and collaborators.
4. **UML modeling** - create class and sequence diagrams.
5. **Java implementation** - demonstrate the selected design patterns in a
   console application.

## Learning objectives

By completing the laboratory, students practice how to:

- analyze requirements from a real-world scenario;
- identify entity, control, and boundary objects;
- assign responsibilities using CRC cards;
- model structure and behavior with UML;
- apply object-oriented design principles; and
- implement and explain common design patterns in Java.

## Course projects

| Project | Scenario | Patterns demonstrated in the Java example |
| --- | --- | --- |
| **Experiment 1 - Agricultural Automation System (AAS)** | Monitor farm conditions, support irrigation decisions, and notify farmers. | Singleton, Factory, Observer, Strategy |
| **Experiment 2 - Dhaka Urban Management System (DUMS)** | Handle citizen complaints, assign urban services, and choose response routes. | Singleton, Factory, Observer, Strategy |
| **Experiment 3 - Smart Urban Community Management System (SUCMS)** | Design and document a larger smart-urban-management scenario. | Refer to the experiment brief and model solution |

The written phases are intentionally broader than the included demonstration
programs. The Java examples simulate data and external services; they do not
require hardware, a live database, internet access, or a graphical interface.

## Design patterns covered

- **Singleton** - provides controlled access to one shared manager or
  repository instance.
- **Factory** - creates an appropriate object from a requested type without
  exposing construction details to the client.
- **Observer** - broadcasts events or status changes to subscribed observers.
- **Strategy** - allows an algorithm, such as an irrigation or route-selection
  policy, to be exchanged at runtime.
- **Adapter** - translates an external API into the interface expected by the
  application. The DUMS brief requires this pattern as part of the complete
  implementation design.

## Repository layout

```text
.
├── AAS/                 # Agricultural Automation System Java example
├── DUMS/                # Dhaka Urban Management System Java example
├── aas.txt              # AAS source/reference listing
├── dums.txt             # DUMS source/reference listing
├── Lab_Outline.pdf      # Laboratory phases and course outline
├── Experiment-1_AAS.pdf # AAS examination brief
├── Experiment-2_DUMS.pdf
├── Experiment-3_SUCMS.pdf
└── Experiment_*_solution_*.docx
                         # Experiment questions and model solutions
```

### AAS implementation

The [AAS](./AAS/) example includes:

- `FarmDataManager` - Singleton;
- `SensorFactory` - Factory for soil-moisture and temperature sensors;
- `AlertPublisher`, `FarmerNotifier`, and `FarmDashboard` - Observer;
- `NormalIrrigationStrategy` and `WaterSavingStrategy` - Strategy; and
- `Main` - a console demonstration of the patterns.

### DUMS implementation

The [DUMS](./DUMS/) example includes:

- `UrbanDatabase` - Singleton;
- `UrbanServiceFactory` - Factory for urban services;
- `StatusPublisher`, `CitizenNotifier`, and `GovernmentDashboard` - Observer;
- `ShortestRouteStrategy` and `FastestRouteStrategy` - Strategy; and
- `Main` - a console demonstration of the patterns.

The DUMS examination brief also specifies an Adapter-based traffic API
integration. The current compact example documents the concept in the brief;
the included Java files focus on the four patterns demonstrated in `Main`.

## Requirements

- Java Development Kit (JDK) 8 or later
- A terminal or Java-capable IDE

No third-party libraries or build tools are required.

## Running the examples

Each project contains a class named `Main`, so compile and run each directory
separately:

```bash
# Run Agricultural Automation System
mkdir -p build/aas
javac -d build/aas AAS/*.java
java -cp build/aas Main

# Run Dhaka Urban Management System
mkdir -p build/dums
javac -d build/dums DUMS/*.java
java -cp build/dums Main
```

The demonstrations print evidence for each pattern, including Singleton
identity checks, factory-created objects, observer subscription/removal, and
alternative strategies.

## Suggested academic workflow

For each project:

1. Read the corresponding experiment brief.
2. Define the scope and assumptions before designing classes.
3. Complete the requirement analysis and object classifications.
4. Prepare CRC cards and ensure collaborators support the stated
   responsibilities.
5. Draw the UML class and sequence diagrams.
6. Implement only the scoped workflow in Java.
7. Run the console application and compare its output with the design.
8. Explain why each pattern is appropriate and identify possible extensions.

## Scope and limitations

These are educational examples rather than production systems. They use
hard-coded or simulated values and print results to the console. Persistence,
authentication, physical IoT integration, live external APIs, AI models, and
GUI clients are outside the current implementation scope unless explicitly
added as part of an experiment.

## Reference material

- [Laboratory outline](./Lab_Outline.pdf)
- [Experiment 1: Agricultural Automation System](./Experiment-1_AAS.pdf)
- [Experiment 2: Dhaka Urban Management System](./Experiment-2_DUMS.pdf)
- [Experiment 3: Smart Urban Community Management System](./Experiment-3_Solution_SUCMS.pdf)
- [AAS questions and solutions](./Experiment_1_solution_AAS_Lab_Exam_Questions_and_Solutions.docx)
- [DUMS questions and model solutions](./Experiment_2_solution_DUMS_Lab_Exam_Questions_and_Model_Solutions.docx)
- [SUCMS questions and model solutions](./Experiment_3_Solution_SUCMS_Lab_Exam_Questions_and_Model_Solutions.docx)

