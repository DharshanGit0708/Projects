# 🚌 TNSTC App: UI/UX Redesign & Prototyping

![TNSTC UI Preview]((1) UI redesign Preview.png)

## 📌 Project Overview
The Tamil Nadu State Transport Corporation (TNSTC) mobile app is a critical public utility. However, the legacy authentication flow suffered from high user friction and complex navigation. 

This project focuses entirely on the **UI/UX redesign** of the app's gateway. My goal was to architect a modern, accessible, and highly responsive mobile-first interface that completely streamlines the user's journey from launch to login.

🔗 **[Click Here to View the Interactive Figma Prototype](https://www.figma.com/proto/K9xQzQyiR3Rkeyia82KwZM/TNSTC-UI-redesign?node-id=80-464&t=sYAjOJREpvNGmqcx-1&scaling=scale-down&content-scaling=responsive&page-id=80%3A408&starting-point-node-id=80%3A409)**

> **💡 Viewing Note:** For the best interactive experience, please ensure your Figma prototype viewing options (top right corner) are set to **"Fit to screen"**. The prototype utilizes "Click-to-Fill" interactions to simulate user input on the active text fields.
---

## 🎨 The Design Transformation (Friction to Flow)

I conducted a UX audit of the legacy app and redesigned the core screens to prioritize readability, accessible touch targets, and a seamless "Happy Path" for authentication.

### 1. Welcome & Language Selection
* **The UX Problem:** Cluttered initial screens with confusing visual hierarchy.
* **The Solution:** A clean splash screen followed by a highly accessible language toggle using standard radio button UI patterns, preparing the layout for future Tamil text expansion.

<p align="center">
  <img src="(2) Welcome Screen.png" width="45%" alt="Welcome Screen Before and After" />
  <img src="(3) Language Selection Screen.png" width="45%" alt="Language Selection Before and After" />
</p>

### 2. The Login & Registration Flow
* **The UX Problem:** Overwhelming input fields and a lack of visual affordances.
* **The Solution:** Simplified inputs, clear error state handling, and the addition of modern conveniences like "Continue with Google" OAuth placeholders. 

<p align="center">
  <img src="(4) Log In Screen.png" width="45%" alt="Log In Screen Before and After" />
  <img src="(6) Sign Up Screen.png" width="45%" alt="Sign Up Screen Before and After" />
</p>

### 3. Password Recovery (OTP Integration)
* **The UX Problem:** A dead-end recovery process that caused user drop-off.
* **The Solution:** Designed a modern, frictionless OTP (One-Time Password) verification screen to allow instant, secure password resets. The prototype utilizes a "Click-to-Fill" illusion to demonstrate the active user input states.

<p align="center">
  <img src="(5) Reset Password Screen.png" width="80%" alt="Reset Password Screen Before and After" />
</p>

---

## 📐 Responsive Design Architecture

While this phase is purely visual, the interface was engineered with future front-end development in mind:
* **Figma Auto Layout:** Components were built using strict Auto Layout rules, ensuring the UI behaves like flexible CSS containers rather than rigid absolute positioning.
* **Component-Based UI:** Buttons, input fields, and typography styles were created as master components, mirroring how a front-end framework handles reusable UI assets.

---

## 🚀 Future Development Scope (Phase 2)

As I transition deeper into Full-Stack development, this UI design serves as my foundational blueprint. The upcoming phases for this project include:
1. **Front-End Execution:** Translating these Figma designs into responsive web components using HTML5, modern CSS3 (Flexbox/Grid), and Vanilla JavaScript.
2. **Backend Integration:** Building the REST API endpoints in Java Spring Boot to handle the OTP generation and user authentication flows mapped out in this design.
