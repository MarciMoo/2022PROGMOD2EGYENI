# 2022PROGMOD2EGYENI

Az egyéni beadandó alapjául a prógmód I.-es beadandóm szolgált, lényegében a funkciója, használata és működése apró helyeken tér el.

MODEL: 
Az api témája egy kórházi adatbázis, ahol a betegek és adataik vannak tárolva. Az adatokat le tudjuk kérni, új adatokat tudunk létrehozni, keresni tudunk betegek, módosítani tudunk betegeket és törölni is tudjuk őket az adatbázisból. Xml fájlban vannak tárolva az objektumok, amiket a model rétegben találunk és az itt megírt beolvasó, író osztályokkal tudunk kezelni. A model rétegben van még a human interface amiből a beteg osztálya van származtatva. A patient osztály rendelkezik attribútumokkal, minden stringként van kezelve az egyszerűbbség kedvéért, kivéve az állapot enum.

CONTROLLER: 
A controller rétegben egy java fájl található amiben minden függvény meg van írva, a listázás, a hozzáadás, a frissítés, a keresés és a törlés. Minden függvény elején a beolvasó osztállyal bekérjük arraylistbe a resource csomagban található patient.xml fájl tartalmát amivel utána dolgozni fogunk. A módosító függvények vége mindig a mentő osztály függvénye, hogy az adatbázisba el legyenek az adatok, például a frissítés.

VIEW: 
Ide érkezik minden GET és POST kérés. A listázás és a keresés kérések json-ként adják vissza az értékeket, a többi egy igaz, vagy hamis booleannel térnek vissza ami a sikerességet jelzi. HTML oldala nincs az api-nak.

A kód a zip fájlban van az eredeti formájában, mert NetBeans nem engedett belépni a GitHubba, ezért Intellij-vel kellett feltöltenem, ami lehetséges hogy adatvesztést okozhatott.

Wildfly a deployt nem engedte arrayindexoutofbound exception miatt(napokig kutatás az interneten és rengeteg változtatás sem segített), pedig szintaktikailag helyesnek kéne lennie a kódnak.
