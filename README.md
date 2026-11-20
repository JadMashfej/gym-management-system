# Gym Management System

A Java object-oriented project for managing a gym: clients, employees, sports, membership cards and subscriptions.

## Classes
- **Stackeholder**: base class with first name, last name, gender and phone, with input validation
- **Clients** (extends Stackeholder): age, weight, height and a membership card
- **Employees** (extends Stackeholder): username and password
- **Card**: membership card with start and end date, type (Gold, Silver or Normal) and an expiry check
- **Sport**: a sport class with room, timing, coach, price and available places
- **Subscription**: links a card to the chosen sports and calculates the total, with a discount for two or more sports

## OOP concepts used
- Inheritance
- Encapsulation (private fields with validated getters and setters)
- Composition

## Notes
This repository contains the core model classes of the project.
