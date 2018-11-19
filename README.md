# Game of life

After [gdcr18](coderetreat.org) my friend Rubén created [a repository](https://github.com/rubendm92/game-of-life) to implement the [Game of life](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life) without using conditionals.

As he explained in his the [README.md](https://github.com/rubendm92/game-of-life/blob/master/README.md):

> This repo is a small exercise I did after our last Global Day of Coderetreat in Madrid. We usually do a restriction based on no conditionals (ifs, switchs, ternary operators...).

> This is usually a shocking restriction and it was for me the first time, but I wanted to take some time to do the whole kata without a conditional. And here it is.

After the session 4, Rubén told me that he had an idea to implement this without conditional and without any data structure.

Just after the event, when we arrived home he sent me the repo with the solution we have been commented in Kotlin. Since the only way to really understand and learn something is to try it by yourself. I grabbed the idea and write a solution in Java **trying to avoid conditionals and data structures**

## Solution

I created two types of cells (`AliveCell` and `DeadCell`), with this two classes and avoid null points in the universe, the next step is to look for the neighbours.

To define the neighborhoods I tried to use the number of neighbours inside them, but after finishing the problem, I realized that a neighborhood without neighbour is the same that the one with two neighbours. Taking this into account I decided to use three categories (thanks Rubén for the idea):

- Unhealthy: Cell here will die
- WithoutEffects: Cell here will keep their state
- Healthy: `AliveCell` will keep alive and `DeadCell` will come to life

After modeling the cells behavior with polymorphism I found a problem in the `Universe` while looking for the neighbours. Despite I avoid a position map to look for the neighbours I need it to classify the neighborhoods :sad:

After all I just need a map to know the type of neighborhood depending on the number of neighbours.

Note: I know a filter uses a conditional

## Run it

- Test: `make test`
- Shell: `make liveshell`
- Run: `make run`

If you want to test any specific case, you can modify the [Main](src/main/java/es/juandavidvega/gol/Main.java) and run `make run`

