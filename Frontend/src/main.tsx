import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import AppSingleton from "./Singleton/AppSingleton.tsx";

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <AppSingleton />
  </StrictMode>,
)