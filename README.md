Oasis Infobyte Virtual Internship (June-July 2026 Batch)

Developer Profile

Name: Priyanshu Kumar

Domain: Java Development

ID Reference: OIB/J2/IP2582

Project Repository Name: OIBSIP

Completed Tasks Overview

As per the core compliance rubric of the Oasis Infobyte fellowship program, this repository contains the production code for Task 2 (Number Guessing Game) and Task 3 (ATM Interface). Both tasks have been decoupled and isolated into dedicated namespaces to satisfy strict Object-Oriented Programming (OOP) architectures.

Folder 1: Priyanshu_Task2 (Number Guessing Game)

An interactive CLI-based integer guessing game utilizing a secure pseudo-random number generator.

Architectural Features

Dynamic input verification and strong compile-time error handling for non-numeric entries (NumberFormatException).

Score-tracking system based on compile iteration performance budgets (remaining attempt math).

Clean state loops to trigger runtime replays.

Execution Instructions

cd Priyanshu_Task2
javac NumberGuessingGame.java
java NumberGuessingGame


Demonstration Video

Click Here to View Task 2 Video Demo

Folder 2: Priyanshu_Task3 (ATM Interface)

A multi-class console simulation of a high-security Automated Teller Machine (ATM) designed with absolute encapsulation.

       [ ATM UI Runtime Controller ] (AtmInterface.java)
                     │
         Handshake & Data Exchange
                     ▼
         [ Encapsulated Entity ] (Account.java)
          ├── Balance (64-bit float tracking)
          └── History Ledger (ArrayList of Objects)
                     │
               Writes state
                     ▼
         [ Immutable Records ] (Transaction.java)


Architectural Features

Encapsulation: Class fields (balance, PIN, history) are completely restricted using private modifiers and only accessed/mutated via validated methods.

Transaction Ledger: Every balance state change instantiates an immutable Transaction object to prevent back-dated alterations in the runtime data structures.

Authentication Handshake: Prevents entry unless both credentials map perfectly to heap references.

Execution Instructions

cd Priyanshu_Task3
javac *.java
java AtmInterface


Default Credentials for Testing:

User ID: Priyanshu

PIN: 3400

Demonstration Video

Click Here to View Task 3 Video Demo

Verification Badges & Certification

This codebase is submitted in partial fulfillment of the academic requirements for internal assessment evaluation under standard university guidelines. All rights reserved.
