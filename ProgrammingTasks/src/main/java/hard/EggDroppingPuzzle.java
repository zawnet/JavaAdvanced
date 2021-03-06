package hard;

/**
 * The following is a description of the instance of this famous puzzle involving n=2 eggs and a building with k=36 floors.
 * Suppose that we wish to know which stories in a 36-story building are safe to drop eggs from, and which will cause the eggs to break on landing. We make a few assumptions:
 * …..An egg that survives a fall can be used again.
 * …..A broken egg must be discarded.
 * …..The effect of a fall is the same for all eggs.
 * …..If an egg breaks when dropped, then it would break if dropped from a higher floor.
 * …..If an egg survives a fall then it would survive a shorter fall.
 * …..It is not ruled out that the first-floor windows break eggs, nor is it ruled out that the 36th-floor do not cause an egg to break.
 * If only one egg is available and we wish to be sure of obtaining the right result, the experiment can be carried out in only one way. Drop the egg from the first-floor window; if it survives, drop it from the second-floor window. Continue upward until it breaks. In the worst case, this method may require 36 droppings. Suppose 2 eggs are available. What is the least number of egg-droppings that is guaranteed to work in all cases?
 * The problem is not actually to find the critical floor, but merely to decide floors from which eggs should be dropped so that the total number of trials are minimized.
 *
 * Jajo, które przeżyje upadek, może być ponownie użyte
 * Rozbite jajko należy wyrzucić
 * Efekt upadku jest taki sam dla wszystkich jaj.
 * Jeśli jajko rozbije się po upuszczeniu, pęknie po upuszczeniu z wyższego piętra.
 * Jeśli jajko przeżyje upadek, przeżyje upadek krótszy
 * Nie jest wykluczone, że okna na pierwszym piętrze rozbijają jajka, ani nie wyklucza się, że na 36. piętrze jajka nie pękają.
 *
 * Jeśli dostępne jest tylko jedno jajko i chcemy mieć pewność uzyskania właściwego wyniku, eksperyment można przeprowadzić tylko w jeden sposób. Upuść jajko z okna na pierwszym piętrze; jeśli przeżyje, zrzuć go z okna na drugim piętrze. Kontynuuj w górę, aż pęknie. W najgorszym przypadku ta metoda może wymagać 36 odchodów. Załóżmy, że dostępne są 2 jajka. Jaka jest najmniejsza liczba odchodów jaj, która będzie działać we wszystkich przypadkach?
 * Problemem nie jest właściwie znalezienie krytycznego piętra, ale jedynie określenie pięter, z których jaja powinny być zrzucane, aby zminimalizować całkowitą liczbę prób.
 */
public class EggDroppingPuzzle {
}
