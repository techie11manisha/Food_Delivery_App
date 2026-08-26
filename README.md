# 🍅 Tomato - Food Delivery App

A simple and user-friendly **Food Delivery Android Application** built using **Kotlin** and **Android Studio**.

The application provides a food-ordering experience where users can browse food items, search through the menu, and interact with different sections of the application.

---

## 📱 About the Project

**Tomato** is an Android-based food delivery application developed as a learning and development project.

The main goal of this project is to build a clean and interactive food-delivery application while learning and applying important Android development concepts such as:

* Android UI development
* Activities and Fragments
* RecyclerView
* Custom Adapters
* View Binding
* Search functionality
* Layout management
* Kotlin programming
* Android Studio project structure

---

## ✨ Features

### 🍔 Food Menu

* Displays available food items.
* Shows food names, prices, and images.
* Uses RecyclerView for displaying menu items efficiently.

### 🔎 Search

* Allows users to search for food items.
* Dynamically filters the available menu items.
* Displays matching food items in the RecyclerView.

### 📋 Menu Interface

* User-friendly food menu interface.
* Food items are displayed using a reusable custom adapter.
* Each menu item contains relevant food information.

### 🧩 Fragment-Based UI

The application uses Android Fragments to organize different sections of the application.

### 📱 Responsive Android UI

The application uses Android XML layouts and standard Android UI components to create the user interface.

---

## 🛠️ Tech Stack

| Technology         | Usage                           |
| ------------------ | ------------------------------- |
| **Kotlin**         | Primary programming language    |
| **Android Studio** | Development environment         |
| **XML**            | UI layout design                |
| **RecyclerView**   | Displaying food items           |
| **View Binding**   | Accessing UI components         |
| **Fragments**      | Managing different UI sections  |
| **Gradle**         | Build and dependency management |
| **Git & GitHub**   | Version control                 |

---

## 📂 Project Structure

The Android project is located inside:

```text
AndroidStudioProjects/
└── Tomato/
    ├── app/
    ├── build.gradle
    ├── settings.gradle
    └── ...
```

Important application components include:

```text
app/
└── src/
    └── main/
        ├── java/
        │   └── com/example/tomato/
        │       ├── Fragment/
        │       ├── adapter/
        │       └── ...
        │
        └── res/
            ├── drawable/
            ├── layout/
            ├── mipmap/
            └── values/
```

---

## 🔄 Application Flow

The basic application flow is:

```text
        ┌─────────────────┐
        │   Open App      │
        └────────┬────────┘
                 │
                 ▼
        ┌─────────────────┐
        │   Food Menu     │
        └────────┬────────┘
                 │
                 ▼
        ┌─────────────────┐
        │ Browse Food     │
        │     Items       │
        └────────┬────────┘
                 │
          ┌──────┴───────┐
          │              │
          ▼              ▼
      Search Food     Browse Menu
          │              │
          └──────┬───────┘
                 ▼
        ┌─────────────────┐
        │ Display Results │
        └─────────────────┘
```

---

## 🚀 Getting Started

### Prerequisites

Before running the project, make sure you have:

* Android Studio installed
* Android SDK configured
* JDK configured for Android Studio
* An Android emulator or physical Android device

### Installation

1. Clone the repository:

```bash
git clone https://github.com/techie11manisha/Food_Delivery_App.git
```

2. Open Android Studio.

3. Select:
open

4. Navigate to:
Food_Delivery_App/AndroidStudioProjects/Tomato


5. Allow Android Studio to sync the Gradle files.

6. Connect an Android device or start an emulator.

7. Click Run ▶ to build and launch the application.

## 🔍 Search Functionality

The application includes a search feature for filtering food items.

The food menu is maintained using lists containing information such as:

* Food name
* Food price
* Food image

The filtered results are then displayed using a `RecyclerView` and a custom adapter.

## 📸 Screenshots

### Home Screen

[Uploading WhatsApp Image 2026-08-26 at 11.28.38 PM.jpeg…]()

## 👩‍💻 Author

**Manisha Jaishwal**

GitHub: [@techie11manisha](https://github.com/techie11manisha)

---

⭐ If you find this project useful, consider giving the repository a star!
