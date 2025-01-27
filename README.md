# Recruitment-Management-System
This project implements a dashboard for managing and analyzing the recruitment process within an organization. The system is tailored to accommodate six teams and a leadership team, handling tasks like job postings, candidate filtering, and statistical analysis


# ⚙️ Organization Dashboard Project

## 📊 Overview
This project implements a dashboard for managing and analyzing the recruitment process within an organization. The system is tailored to accommodate six teams and a leadership team, handling tasks like job postings, candidate filtering, and statistical analysis.

### 👥 Teams in the Organization
1. **🔢 Training**
2. **📝 CRM**
3. **🎥 Media & Marketing**
4. **💼 Admin / Operations**
5. **💪 HR**
6. **🚀 Placement**

### 📚 Leadership Team
- **💪 HR**
- **🔮 Team Leader**
- **👑 CEO**

The leadership team has exclusive access to the dashboard for analyzing data and managing recruitment processes.

## 🚀 Recruitment Process Workflow

### **L0 - 📚 Job Posting**
- Manual process for posting job openings.

### **L1 - 🔎 Filter Profile**
- Profiles are filtered, and candidates are evaluated in a **📞 telephonic round** to check attitude.
- Outcome: ✅ Selected / ❌ Rejected

### **L2 - 🔧 Technical Round**
- Conduct technical interviews.
- **Condition**: Restriction 2n+1 (at least one-third of candidates move forward).
- Result is updated.

### **L3 - 💪 Actual HR Round**
- Conduct HR interview.

### **L4 - 💰 Final Round**
- Shortlist candidates: **1/2 of the remaining candidates get selected**.
- Finalize financial terms and CTC.

### 📊 Additional Features
- **🔄 Statistics Analysis**: Provides insights into all positions raised by different teams.
- The dashboard is visible **only** to Admins (HR/Leadership Team).

## 🛠️ Technologies Used

### Frontend
- **⚖️ HTML**: Structure and layout.
- **💄 CSS**: Styling and design.
- **🔹 Bootstrap**: Responsive UI components.
- **🔧 JavaScript**: Interactive functionalities.
- **⚡ AngularJS**: Framework for dynamic and scalable front-end development.

### Backend
- **☕ Java**: Core backend logic.
- **🌱 Spring Boot**: Framework for developing microservices and backend APIs.
- **🔧 Spring Data JPA**: Simplifies database interactions and ORM functionalities.
- **📊 Spring-Datatables**: Facilitates server-side processing for tables and reports.

### Database
- **📊 MySQL**: Stores and manages all recruitment and team-related data.

## ✨ Features of the Dashboard
1. **🔧 Role Management**:
   - Allow teams to raise position requests.
   - Leadership team manages and monitors these requests.
2. **✅ Recruitment Process Tracking**:
   - Tracks candidates' progress through different rounds (L0 to L4).
3. **🔄 Statistics and Analytics**:
   - Provides insights into job positions, candidates filtered, and final selections.
   
## 📚 Setting Up the Project

### 🔍 Prerequisites
- Install **☕ Java 17** or higher.
- Install **🛠️ Node.js** (for frontend dependency management).
- Install **📊 MySQL Server**.
- Install **🔧 Apache Maven**.

### 🔄 Clone the Repository
```bash
$ git clone <repository-url>
$ cd organization-dashboard
```

### 📚 Backend Setup
1. Navigate to the backend directory.
2. Run Maven build:
   ```bash
   $ mvn clean install
   ```
3. Update MySQL configuration in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/dashboard_db
   spring.datasource.username=<username>
   spring.datasource.password=<password>
   ```
4. Start the Spring Boot application:
   ```bash
   $ mvn spring-boot:run
   ```

### ⚡ Frontend Setup
1. Navigate to the frontend directory.
2. Install dependencies:
   ```bash
   $ npm install
   ```
3. Run the AngularJS application:
   ```bash
   $ ng serve
   ```

### 🌐 Access the Dashboard
- Open your browser and navigate to `http://localhost:4200`.

## 📢 Deployment
- Build the backend using Maven and deploy the `war`/`jar` file to a production server.
- Use Angular production build (`ng build --prod`) and deploy the static files to a web server like Nginx or Apache.

## 🗳️ Folder Structure
```
organization-dashboard/
├── backend/
│   ├── src/
│   └── pom.xml
├── frontend/
│   ├── src/
│   └── package.json
└── README.md
```

## 👨‍👩‍👦 Contributing
- Fork the repository and create a feature branch.
- Raise pull requests for review and merging.

## 📄 License
This project is licensed under the MIT License. See the `LICENSE` file for details.

