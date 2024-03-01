import { Inter } from "next/font/google";
import "./globals.css";
import Navbar from "./components/Navbar";
import "bootstrap/dist/css/bootstrap.css";

const inter = Inter({ subsets: ["latin"] });

export const metadata = {
  title: "Protótipo Gerenciador de RH",
  description: "Protótipo Gerenciador de RH",
};

export default function RootLayout({ children }) {
  return (
    <html lang="pt-BR">
      <head>
        <script
          src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
          crossOrigin="anonymous"
        ></script>
      </head>

      <body className={inter.className}>
        <Navbar />
        <div className="container m-4">{children}</div>
      </body>
    </html>
  );
}
