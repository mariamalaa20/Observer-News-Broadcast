# 📰 Observer Pattern - News Broadcast

A simple implementation of the Observer Design Pattern in Java, where a news agency notifies multiple subscribers of new updates in real-time.

---

## ✨ Features

* Demonstrates the classic **Observer Design Pattern**
* Allows adding/removing subscribers dynamically
* Sends real-time updates to all active subscribers
* Modular and easily extendable architecture

---

## 📦 Requirements

* Java JDK 8 or higher
* A Java IDE or command-line terminal

---

## 💠 Installation

Clone the repository and compile the code using your terminal:

```bash
git clone https://github.com/yourusername/news-agency-observer-pattern.git
cd news-agency-observer-pattern
javac *.java
```

---

## 📁 Project Structure

```plaintext
.
├── IObserver.java       # Observer interface
├── ISubject.java        # Subject interface
├── NewsAgency.java      # Concrete subject (Publisher)
├── Subscriber.java      # Concrete observer (Subscriber)
├── Main.java            # Entry point to demonstrate the pattern
```

---

## 🚀 Usage

To run the demonstration:

```bash
java Main
```

Expected output:

```
Message for Adam: Breaking News: Observer Design Pattern!
Message for Sara: Breaking News: Observer Design Pattern!
Message for Sara: Update: Adam has unsubscribed.
```

---

## 🔮 Future Enhancements

* Add GUI interface for dynamic subscription
* Allow subscribers to filter types of news
* Integrate with real-world news API for live updates

---

