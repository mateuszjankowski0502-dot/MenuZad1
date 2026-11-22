# Pasek – Zadanie 1

## Opis projektu
Aplikacja Android napisana w języku Java. Projekt przedstawia wykorzystanie Toolbar, menu opcji, dodatkowej aktywności oraz dolnej nawigacji BottomNavigationView.

## Funkcjonalności
- Własny Toolbar bez domyślnego ActionBar.
- Menu opcji z trzema pozycjami.
- Obsługa kliknięć elementów menu.
- Osobny ekran „O aplikacji”.
- Strzałka powrotu do ekranu głównego.
- Dolna nawigacja z sekcjami Formularz i Ustawienia.

## Zrzuty ekranu
W tym miejscu należy dodać zrzuty ekranu:
1. Ekran główny z Toolbar.
2. Rozwinięte menu opcji.
3. Ekran „O aplikacji”.
4. Dolna nawigacja – Formularz.
5. Dolna nawigacja – Ustawienia.

## Pytania kontrolne

### 1. Co się stanie po zmianie `app:showAsAction` na `android:showAsAction`?

Atrybut `showAsAction` powinien być używany z przestrzenią nazw `app`, ponieważ pochodzi z biblioteki AndroidX AppCompat. Użycie przestrzeni nazw `android` może spowodować, że atrybut nie będzie działał zgodnie z oczekiwaniami lub kompilacja zgłosi błąd.

### 2. Dlaczego ostatnia linia metody `onOptionsItemSelected()` to `return super.onOptionsItemSelected(item)` zamiast `return false`?

Wywołanie `super.onOptionsItemSelected(item)` przekazuje nieobsłużone kliknięcie do klasy nadrzędnej. Dzięki temu zachowana jest standardowa obsługa zdarzeń przez AndroidX. `return false` po prostu informuje, że zdarzenie nie zostało obsłużone.
