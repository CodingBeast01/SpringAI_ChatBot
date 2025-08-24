# Gemini AI Chat Frontend

A modern, animated chat interface for interacting with Google's Gemini AI through a Spring Boot backend.

## ✨ Features

### 🎨 Modern UI Design
- **Glassmorphism Design**: Beautiful frosted glass effects with backdrop blur
- **Gradient Backgrounds**: Eye-catching color schemes throughout the interface
- **Responsive Layout**: Works perfectly on desktop, tablet, and mobile devices

### 🚀 Smooth Animations
- **Slide Animations**: Messages slide in smoothly from different directions
- **Hover Effects**: Interactive elements respond to user interactions
- **Loading States**: Animated typing indicators and loading messages
- **Particle Background**: Subtle animated particles in the background

### 💬 Enhanced Chat Experience
- **Chat History**: Persistent conversation history during the session
- **Message Types**: Different styling for user, AI, and error messages
- **Timestamps**: Each message shows when it was sent
- **Auto-scroll**: Automatically scrolls to new messages
- **Scroll to Top**: Quick navigation button for long conversations

### 🛠️ Advanced Features
- **Export Chat**: Download your conversation as a text file
- **Clear Chat**: Reset the conversation at any time
- **Welcome Screen**: Helpful tips and feature overview for new users
- **Input Enhancements**: Typing indicators and helpful tips
- **Keyboard Shortcuts**: Press Enter to send messages

## 🎯 Getting Started

### Prerequisites
- Node.js (v16 or higher)
- Your Spring Boot backend running on `http://localhost:8081`

### Installation

1. **Clone the repository**
   ```bash
   git clone <your-repo-url>
   cd gemini-chat-frontend
   ```

2. **Install dependencies**
   ```bash
   npm install
   ```

3. **Start the development server**
   ```bash
   npm run dev
   ```

4. **Open your browser**
   Navigate to `http://localhost:5173`

## 🔧 Configuration

### Backend API Endpoint
The frontend expects your Spring Boot backend to be running on:
```
http://localhost:8081/api/qna/ask
```

### API Request Format
```json
{
  "question": "Your question here"
}
```

### API Response Format
```json
{
  "candidates": [
    {
      "content": {
        "parts": [
          {
            "text": "AI response text"
          }
        ]
      }
    }
  ]
}
```

## 🎨 Customization

### Colors and Themes
The application uses CSS custom properties for easy theming. Main colors are defined in `src/App.css`:

- **Primary**: `#667eea` to `#764ba2` (gradient)
- **Success**: `#4CAF50` to `#45a049` (gradient)
- **Error**: `#ff6b6b` to `#ee5a24` (gradient)
- **Warning**: `#ffd93d` to `#ff6b6b` (gradient)

### Animations
All animations are defined using CSS keyframes and can be easily modified:
- `slideDown`, `slideUp`, `slideInUp`, `slideInRight`
- `fadeIn`, `float`, `bounce`, `pulse`, `typing`

## 📱 Responsive Design

The application is fully responsive with breakpoints at:
- **Desktop**: 1200px and above
- **Tablet**: 768px to 1199px
- **Mobile**: 480px to 767px
- **Small Mobile**: Below 480px

## 🚀 Performance Features

- **Lazy Loading**: Components load only when needed
- **Smooth Scrolling**: CSS-based smooth scrolling behavior
- **Optimized Animations**: Hardware-accelerated CSS transforms
- **Efficient Rendering**: React hooks for optimal performance

## 🛠️ Development

### Project Structure
```
src/
├── components/
│   ├── ChatInput.jsx      # Enhanced input with animations
│   ├── ChatResponse.jsx   # Message display component
│   ├── WelcomeMessage.jsx # Welcome screen component
│   └── ParticleBackground.jsx # Animated background
├── App.jsx                # Main application component
├── App.css                # Comprehensive styling
└── main.jsx              # Application entry point
```

### Available Scripts
- `npm run dev` - Start development server
- `npm run build` - Build for production
- `npm run preview` - Preview production build
- `npm run lint` - Run ESLint

## 🔮 Future Enhancements

- [ ] Dark/Light theme toggle
- [ ] Message search functionality
- [ ] Chat categories and organization
- [ ] Voice input support
- [ ] File upload capabilities
- [ ] User authentication
- [ ] Chat history persistence

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests if applicable
5. Submit a pull request

## 📄 License

This project is licensed under the MIT License.

## 🙏 Acknowledgments

- Built with React 19 and Vite
- Styled with modern CSS and animations
- Designed for optimal user experience
- Integrated with Google Gemini AI via Spring Boot

---

**Happy Chatting! 🤖✨**
