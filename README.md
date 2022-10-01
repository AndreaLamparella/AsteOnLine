# AsteOnLine


Il sito "Aste OnLine" permette di organizzare e gestire la messa all’asta di oggetti e
l’assegnazione degli stessi al miglior offerente attraverso la conduzione di processi d’asta. Il
servizio, che verrà fornito attraverso il Web, presenta le seguenti caratteristiche di funzionamento:
- **Gestione degli oggetti d’asta** : gli utenti registrati hanno la possibilità di inserire e
modificare oggetti da mettere all’asta. Ogni oggetto è caratterizzato da un nome, una
descrizione, un anno di produzione, un prezzo di partenza, e una categoria a scelta tra quelle
predefinite (es. mobile, quadro). L’amministratore delle aste può inserire e modificare le
categorie di oggetti, ognuna caratterizzata da un nome e da una descrizione;
- **Gestione del processo d’asta**: l’amministratore delle aste può aprire nuove aste, definendo
per ognuna di esse: nome dell’asta, data d’inizio, durata e oggetti in vendita per quell’asta.
Una volta creata un’asta, viene inviata una notifica automatica via email a tutti gli utenti
registrati nel sistema, che possono iscriversi all’asta se interessati. Giunta la data di inizio,
l’amministratore delle aste può avviare un’asta e a questo punto tutti gli utenti iscritti
all’asta possono partecipare effettuando offerte. Al proprio termine temporale, un’asta viene
dichiarata chiusa e tutti gli oggetti offerti vengono aggiudicati ai rispettivi migliori offerenti.
La chiusura di un’asta comporta l’inizio del processo di addebito ai vincitori. Il processo di
delivery degli oggetti aggiudicati viene gestito da una società esterna;
- **Gestione degli utenti**: deve essere possibile la registrazione online degli utenti. Il processo
di registrazione richiede username, password, nome completo, email, indirizzo, numero
telefonico e dati relativi alla modalità di pagamento per effettuare acquisti e vendite (c/c o
altra modalità), che verrà verificata al momento della registrazione. Per poter usufruire dei
servizi offerti dal sistema, un utente registrato dovrà prima autenticarsi, fornendo username
e password. Gli utenti registrati possono: inserire nuovi oggetti da mettere all’asta,
partecipare alle aste alle quali sono interessati (iscrivendosi prima dell’inizio), fare offerte,
visualizzare i migliori offerenti al termine di ogni asta alla quale partecipavano, e
visualizzare la lista delle aste vinte. Analogamente, anche un amministratore dovrà
autenticarsi per poter svolgere le sue funzioni;
- **Gestione delle ricerche**: tutti gli utenti possono effettuare ricerche fra gli oggetti d’asta,
con filtri in base alla categoria, nome e descrizione degli oggetti.
Le categorie di utenti del sistema sono le seguenti:
- Utenti generici: possono effettuare ricerche e registrarsi come utenti del servizio;
- Utenti registrati: possono gestire il proprio account, inserire e modificare oggetti d’asta sulla
base delle categorie esistenti, e partecipare alle aste;
- Amministratori: possono inserire e modificare categorie di oggetti d’asta, creare aste,
gestire la riscossione del pagamento dai vincitori d’asta e preparare gli oggetti per la
consegna al destinatario.

## Task 1

```
1) Rappresentare il diagramma dei casi d’uso
```
```
2) Rappresentare il modello di dominio
```
```
3) Per ogni membro del gruppo, descrivere un caso d’uso a scelta in formato dettagliato
```

## Task 2


Si consideri il sistema AsteOnLine introdotto nel Task 1 del Progetto.

```
1) Per ogni membro del gruppo, scegliere un caso d’uso tra quelli descritti in formato dettagliato
nel Task 1 e modellarlo in termini di diagramma di sequenza di sistema.
```
```
2) Per ogni membro del gruppo, identificare due operazioni di sistema e descriverle in termini di
contratti in un file di testo, adattando il modello di dominio con nuove classi, attributi e
associazioni quando opportuno. Da segnalare nel file di testo anche le modifiche apportate e le
motivazioni per tali modifiche.
```

## Task 3

Sulla base delle specifiche modellate nei Task precedenti, si vuole progettare un’architettura logica
del sistema a strati rilassata, organizzandola in almeno tre strati: UI, Domain, e Services. Lo strato UI
si occuperà di gestire le interazioni da parte dell’utente delegando le operazioni allo strato sottostante.
Lo strato Domain gestirà la logica applicativa. Infine, lo strato Services offrirà i servizi tecnici
necessari (ad esempio, la gestione del servizio di posta elettronica e i pagamenti).

```
1) Per ogni membro del gruppo, produrre un diagramma di sequenza per ogni operazione di
sistema descritta in termini di contratto nel Task precedente.
```
```
2) Produrre un diagramma delle classi di progetto con i relativi package di appartenenza, aderenti
all’architettura logica richiesta, in termini di strati e partizioni. Ove ritenuto utile, applicare i
design pattern visti a lezione; tali pattern andranno indicati in un file testuale, specificando per
ogni caso le classi del diagramma coinvolte.
```

## Task 4

Sulla base delle scelte di progettazione definite nei task precedenti, si vuole modellare il comportamento del
sistema mediante macchine a stati, quindi procedere all’implementazione di parte del progetto.


1. A seconda della dimensione del gruppo*, produrre i diagrammi di macchina a stati, modellando il
    comportamento degli oggetti di una specifica classe in modo trasversale per tutti i casi d’uso interessati
    dagli eventi seguenti:

    + Utente - registrazione;
    + Asta – dalla creazione alla chiusura;
    + Oggetto – dalla creazione alla consegna. <br><br>
    
2. Implementare in linguaggio Java lo scheletro di alcune fra le classi più significative del modello. In
    particolare, **per ogni membro del gruppo,** implementare una classe a scelta del layer del dominio
    limitandosi per i metodi alla firma e ad eventuali chiamate ad altri metodi; a tale scopo, risulta utile
    fare riferimento ai diagrammi di sequenza prodotti precedentemente. Qualora il numero di classi fosse
    inferiore al numero di membri del gruppo, sceglierne altre tra le classi a disposizione in tutti i layer.

 
(*) Dimensioni del gruppo:
- Gruppi individuali: produrre 1 fra i diagrammi richiesti
- Gruppi di 2/3 membri: produrre 2 fra i diagrammi richiesti
- Gruppi di 4/5 membri: produrre tutti i diagrammi richiesti

## Task 5

Sulla base delle specifiche del sistema "Aste OnLine" modellate nei Task precedenti, si considerino
le seguenti funzionalità:

- È previsto il ruolo aggiuntivo di Utente Premium. Un Utente Registrato diventa Utente
    Premium nel momento in cui si aggiudica almeno 2 0 oggetti dalle aste alle quali ha
    partecipato. L’operazione di passaggio a Utente Premium viene gestita automaticamente dal
    sistema. Un Utente Premium ha la possibilità di creare aste riservate ai propri oggetti e
    monitorare l’andamento delle offerte nelle proprie aste, decidendo autonomamente quando
    concludere un’asta. La fase che segue la chiusura di un’asta, ossia pagamenti e spedizioni,
    viene gestita dall’Amministratore come per le aste tradizionali.
- È prevista la funzionalità di rilancio automatico degli oggetti all’asta. Nel momento in cui
    l’Utente Registrato (e iscritto all’asta) effettua un’offerta valida per un oggetto, può applicare
    la funzionalità di rilancio automatico per quell’oggetto, specificando importo del rilancio e
    numero massimo di rilanci, da effettuare automaticamente quando il sistema riceve un’offerta
    valida per quell’oggetto da parte di un altro utente. Il rilancio automatico viene effettuato
    fintantoché non si raggiunge il numero massimo di rilanci oppure il rilancio rappresenta
    l’offerta massima corrente.
- È prevista la funzionalità di analisi delle aste terminate. L’Amministratore può consultare le
    aste terminate e produrre un report statistico mensile o annuale relativo all’importo totale degli
    oggetti venduti, al quantitativo medio di oggetti venduti e al numero medio di partecipanti.

## CONSEGNA:



<span style="text-decoration: underline">Sulla base delle nuove funzionalità</span>,

**Gruppi individuali**:

- produrre/modificare il diagramma dei casi d’uso;
- descrivere/modificare i casi d’uso in formato dettagliato;
- produrre/modificare il modello di dominio;
- produrre un documento di relazione PDF che raccolga tutti gli artefatti prodotti nei vari Task
    di progetto (diagrammi, casi d’uso in formato dettagliato, contratti, codice, e altra
    documentazione di approfondimento, ad esempio relativa a pattern applicati e altre scelte).

**Gruppi da 2/3 membri: Oltre a quanto sopra**

- produrre un diagramma di sequenza di sistema e descrivere un contratto a testa. Qualora i
    contratti non fossero in numero sufficiente, è possibile selezionare nuovi contratti dai
    diagrammi di sequenza di sistema modellati in precedenza o da casi d’uso non modellati.

**Gruppi da 4/5 membri: Oltre a quanto sopra**

- produrre un diagramma di sequenza per un’operazione di sistema a scelta;
- produrre/modificare il diagramma delle classi di progetto, motivando i pattern applicati;

```
**NOTA**: Nel caso di modifiche ad artefatti prodotti nei Task precedenti, indicare chiaramente quali
sono le nuove modifiche (es. testo o costrutto UML evidenziato in un particolare colore).
```
```
CONSEGNA: 12/06/2021 ore 12.00, da effettuare sul repository di gruppo per chi utilizza
RSAD oppure nella sezione del corso dedicata alla consegna per chi utilizza Visual Paradigm.
Inviare il documento di relazione PDF anche via email al docente di Laboratorio del turno.
```
