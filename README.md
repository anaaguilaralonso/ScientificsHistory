This repository has some exercises in order to explore the possibilities of changing the GIT history 

# Rewriting the History

This project it's made to make you a time traveller! You can play by changing the history of Marie Curie through the commits about her life. 

## Getting Started

The repository contains an Android app that has a list of several events or curiosities about the life of Marie Curie. 

It has a ```CuriositiesProvider``` and an ```EventProvider```. The curiosities should be shown with italic style but not for the events.

The repository has different branches with several commits about the life of Marie Curie. Each branch is going to have a challenge that you can achieve by changing the history of the commits.
After this challenges, I hope you can play with the history of your own commits and make a proper commit history of your developments.

### Let's do it

You're in a team developing an app that is going to list events and curiosities about different scientifics. Each member of the team should take care about one scientific and luckyly, your scientific is Marie Curie! You need to investigate a litte bit about her life and show it through the app.

##### Challenge 1

Go to the proper branch
```
git checkout MarieCurie/Challenge1
```
Run the app and take a look at the commits. 

As you can see, the last commit is about the Physics Degree of Marie Curie. 
Now we know that she was first of her promotion on that degree. Could you add that information to the last commit in order to avoid one incomplete commit?

*Clue: Try to use amend*

##### Challenge 2

Go to the proper branch
```
git checkout MarieCurie/Challenge2
```
Run the app and take a look at the commits. 

Don't you think that it's sad to see that she fainted from hunger in our commit message? Maybe it's a tough information for a commit message... Could you remove that information just for the commit message?

*Clue: Try to use interactive rebase with reword option*

##### Challenge 3

Go to the proper branch
```
git checkout MarieCurie/Challenge3
```
Run the app and take a look at the commits. 

Let's get rid of a bit of sadness in the history. Could you remove in the code the part that said that she was refused from the University? Let's change the history and write that she came back to Paris because she was in love with Pierre. 
We don't want a trace with the information that says that she was refused so... try to change directly the commit that has that information!

*Clue: Try to use interactive rebase with edit option. Maybe stashing the changes also helps*

##### Challenge 4

Go to the proper branch
```
git checkout MarieCurie/Challenge4
```
Run the app and take a look at the commits. 

As you can see, all commits have the same structure: add a curiosity/event and show it through ```MainPresenter```. But there is one commit with the message *"She meet Pierre"* that just add information to the function `getScientificInvestigation()`. 
Don't you think that make sense to have all information of the function `getScientificInvestigation()` in one commit? Try to join both commits, the one that creates the function `getScientificInvestigation()` and the one that add information. Maintain also both commit messages. 

*Clue: Use interactive rebase with squash option*

##### Challenge 5

Go to the proper branch
```
git checkout MarieCurie/Challenge5
```
Run the app and take a look at the commits. 

Wow! She won two Nobel Prizes! Let's play with the history. Could you have the commits about the Nobel Prizes together, one before the other? 
The app should maintain the same list and the same order of the events, you just need to change the order of the commits. Move the Second Nobel Prize after the first one. 

*Clue: Use interactive rebase and move the order of the commits with pick option*

*For the first time in the exercise, you're going to resolve conflicts!*

##### Challenge 6

Go to the proper branch
```
git checkout MarieCurie/Challenge6
```
Run the app and take a look at the commits. 

You have a team member that is doing the history of Albert Einstein. He tells you that Marie Curie was with Einstein in the Solvey Congress. Could you add it to the Solvey Congress commit? In this case, first create a commit adding that Marie Curie came across Einstein in that Congress and then add that commit to the Solvey Congress one

*Clue: Use interactive rebase with fixup option*

##### Challenge 7

Go to the proper branch
```
git checkout MarieCurie/Challenge7
```
Run the app and take a look at the commits. 

Well.. seems that we came to the end of the exercise, but we don't want to make the story of Marie Curie end so... Could you remove the last commit?

*Clue: Use interactive rebase with drop option*

## Getting Finished
Hope you enjoy the exercise!

Take into account that you those things change the history of the commits!! So please, don't change the history of a branch that is used or its going to be used by other team member. 
