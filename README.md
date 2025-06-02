# 🎲 Roll the Dice

## Descrizione

Una semplice app Android che simula il lancio di un dado e sfida l'utente a indovinare il numero generato. Il progetto è sviluppato in Kotlin utilizzando Android Studio e l'interfaccia grafica è basata su ConstraintLayout.

## Funzionalità

- Mostra un'immagine iniziale di due dadi e la scritta "Indovina il numero".
- L'utente può premere un pulsante per lanciare il dado.
- Viene mostrato un messaggio che indica il numero casuale estratto.
- Una seconda schermata mostra la faccia del dado corrispondente al numero.

## Descrizione activity

### `MainActivity.kt`
Questa è l'activity principale, dove l'utente interagisce con l'app:
- Contiene un pulsante (`Lancia`) che genera un numero casuale da 1 a 6.
- Mostra un `Toast` con il numero estratto.
- Avvia la **SecondActivity**, passando il numero generato come parametro.

### `SecondActivity.kt`
Questa seconda activity riceve il numero casuale estratto e:
- Seleziona la faccia del dado corrispondente (da `dice_face_1` a `dice_face_6`).
- Mostra l'immagine del dado usando una `ImageView`.

## Risorse esterne

Le immagini del dado e delle sue facce sono inclusa nella cartella `res/drawable`.
