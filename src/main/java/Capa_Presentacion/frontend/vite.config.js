import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    // port: 8080 ,// El puerto que desees usar
    proxy: {
      '/api': 'http://localhost:8080' // Proxy requests to the Spring Boot backend
    }
  }
})
