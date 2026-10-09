Navn: Rasmus Nyggard Larsen Mail: rala1005@stud.ek.dk

** DEl 3**

Komposition (has-a):

Jeg bruger komposition mellem klassen Character og inventory-arrayet.
Character har et inventory, som er oprettet inde i Character-klassen
gennem metoden createInventory(). Det betyder, at en Character "har"
et inventory (has-a). 

Nedarving (is-a):

I min kode har jeg ikke klasser, der nedarver fra hinanden endnu.
Der er dog en mulighed for nedarving mellem forskellige typer af
characters, fordi Warrior, Mage og Rogue har nogle af de samme
egenskaber og metoder. De ville kunne dele fælles felter og metoder som name, health, level,
gold, attack(), heal() og takeDamage(). Jeg kunne for eksempel lave en fælles superklasse kaldet Character
og derefter lave ahve Warrior extends Character, Mage extends Character og Rogue extends Character.
