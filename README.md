<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=190&section=header&text=Gabriel%20Mucacho%20J%C3%BAnior&fontSize=38&fontColor=ffffff&animation=fadeIn&fontAlignY=36&desc=Computer%20Engineering%20Student%20%C2%B7%20Product%20Builder&descSize=16&descAlignY=56" alt="Gabriel Mucacho Júnior" width="100%" />

<a href="https://git.io/typing-svg">
  <img src="https://readme-typing-svg.demolab.com?font=JetBrains+Mono&weight=500&size=18&pause=1200&color=58A6FF&center=true&vCenter=true&width=700&lines=Android+%C2%B7+Web+%C2%B7+Backend+%C2%B7+Infrastructure;From+problem+to+architecture+to+release;Building+Vaultar+and+Docxion" alt="Typing intro" />
</a>

<br />

<a href="https://gabrielmjr.vercel.app"><img src="https://img.shields.io/badge/Portfolio-gabrielmjr.vercel.app-0f1726?style=for-the-badge" alt="Portfolio" /></a>
<a href="https://www.linkedin.com/in/gabrielmjr05"><img src="https://img.shields.io/badge/LinkedIn-Connect-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn" /></a>
<a href="https://orcid.org/0009-0009-6115-9131"><img src="https://img.shields.io/badge/ORCID-iD-A6CE39?style=for-the-badge&logo=orcid&logoColor=white" alt="ORCID" /></a>

</div>

---

## `$ whoami`

```shell
$ whoami
gabrielmjr

$ cat /etc/profile
name       : Gabriel Mucacho Júnior  (Gabriel MJr)
role       : Computer Engineering student & product builder
university : Eduardo Mondlane University
location   : Maputo, Mozambique 🇲🇿
orgs       : @MJrFusion, @Tigrion-Labs

$ echo $PHILOSOPHY
Understand the problem → define the architecture → build → evolve.
```

> *"If you don't want to find bugs while coding, don't code. If you keep coding, it means you will fix them."*

---

## `$ work.yaml`

```yaml
work:
  mode: independent
  since: 2025
  lifecycle: [problem analysis, architecture, implementation, testing, release, maintenance]
  areas:
    - Android applications (Kotlin + Jetpack Compose + NDK)
    - Web applications (Next.js, React, TypeScript, Tailwind CSS)
    - Backend services, APIs and third-party integrations
    - Infrastructure (BaaS, PaaS, IaaS)
    - Software architecture & document processing
  open_for:
    - open source contributions
    - collaboration
    - concrete projects and opportunities
```

---

## `$ projects`

<table>
  <tr>
    <td width="50%" valign="top">

### <img src="https://vaultar.web.app/logo.svg" width="28" height="28" alt="Vaultar logo" align="absmiddle" /> Vaultar
**Private, offline-first document vault for Android**

![Android](https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=flat-square&logo=jetpackcompose&logoColor=white)

Important documents arrive through different apps and channels, then get scattered and hard to find. Vaultar is a dedicated place to **scan, store, organize, search and read** them, with no account and no cloud required for core workflows.

[![Google Play](https://img.shields.io/badge/Google_Play-Get_it-34A853?style=flat-square&logo=googleplay&logoColor=white)](https://play.google.com/store/apps/details?id=com.mjrfusion.vaultar)
[![Website](https://img.shields.io/badge/Website-vaultar.web.app-58A6FF?style=flat-square)](https://vaultar.web.app/)

  </td>
  <td width="50%" valign="top">

### 📄 Docxion
**Reusable Office document viewing for Android**

![Open Source](https://img.shields.io/badge/Open%20Source-222222?style=flat-square&logo=opensourceinitiative&logoColor=white)
![Apache 2.0](https://img.shields.io/badge/Apache%202.0-D22128?style=flat-square&logo=apache&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![TypeScript](https://img.shields.io/badge/TypeScript-3178C6?style=flat-square&logo=typescript&logoColor=white)

An open-source Jetpack Compose library for viewing **DOC, DOCX, XLS, XLSX, PPT and PPTX**. It embeds a TypeScript viewer in a WebView and exposes a native Kotlin API. Born from Vaultar's need for a reusable viewing layer.

[![GitHub](https://img.shields.io/badge/GitHub-MJrFusion/Docxion-181717?style=flat-square&logo=github&logoColor=white)](https://github.com/MJrFusion/Docxion)
![Status](https://img.shields.io/badge/status-early%20development-orange?style=flat-square)

  </td>
  </tr>
</table>

### Vaultar: capabilities

```yaml
vaultar:
  package: com.mjrfusion.vaultar
  platform: Android
  philosophy: [local-first, privacy-oriented, no mandatory account, no mandatory cloud]
  scan:
    - camera-based scanning
    - automatic document detection
    - manual crop & perspective correction
    - enhancement filters
    - single and multi-page PDF creation
  library:
    - import PDFs and Office files (DOC, DOCX, XLS, XLSX, PPT, PPTX)
    - collections, favorites, search
    - integrated reader with text selection
    - export and share on demand
  security: biometric / device authentication
  premium:
    model: one-time purchase (no subscription)
    unlocks: [OCR when scanning, no ads]
```

### Docxion: quick start

```shell
# 1. add JitPack to settings.gradle.kts
maven("https://jitpack.io")

# 2. add the dependency
implementation("com.github.MJrFusion:Docxion:<version>")
```

```kotlin
DocxionViewer(
    modifier = Modifier.fillMaxSize(),
    callbacks = callbacks,
    onApiCreated = { api -> api.openFile(uri) }
)
```

<details>
<summary><b>Architecture: Docxion</b></summary>

<br />

```text
Android Application
        │
        ▼
Docxion Android Library      (Kotlin · Jetpack Compose)
        │
        ▼
Android WebView  ⇄  JavaScript bridge
        │
        ▼
office-viewer                (TypeScript · React · Vite)
        │
        ▼
Document renderers           (Word · Spreadsheet · Presentation)
```

```json
{
  "project": "Docxion",
  "license": "Apache-2.0",
  "organization": "MJrFusion",
  "modules": {
    "Docxion": "Android / Jetpack Compose library",
    "office-viewer": "TypeScript / React viewer",
    "Example": "Example Android application"
  },
  "capabilities": [
    "open / close documents",
    "page navigation",
    "zoom, fit-to-width, fit-to-page",
    "search & text selection",
    "themes",
    "printing"
  ],
  "note": "Availability depends on the active document and its renderer."
}
```

</details>

---

## `$ stack.json`

```json
{
  "languages": {
    "general_purpose": ["Kotlin", "Java", "Python"],
    "web": ["TypeScript", "JavaScript", "HTML", "CSS"],
    "data": ["SQL", "GraphQL"],
    "scripting": ["Bash / Shell"]
  },
  "android": ["Android SDK", "NDK", "Jetpack Compose", "AndroidX", "Kotlin Coroutines"],
  "web": ["React", "Next.js", "Vite", "Tailwind CSS"],
  "backend": {
    "frameworks": ["Spring Boot", "FastAPI", "Flask"],
    "apis": ["REST"],
    "integrations": ["Google Play Billing", "Ad SDKs", "Third-party APIs & SDKs"]
  },
  "data": {
    "relational": ["PostgreSQL", "SQLite"],
    "document": ["MongoDB"],
    "in_memory": {
      "store": ["Redis"],
      "uses": ["caching", "pub/sub", "streams", "queues", "lists", "hashes"]
    }
  },
  "infrastructure": {
    "os": ["Linux"],
    "cloud_models": ["IaaS", "PaaS", "BaaS"],
    "containerization": ["Docker", "Podman"],
    "reverse_proxies": ["Nginx", "HAProxy"]
  },
  "architecture": {
    "styles": ["Monolithic", "Modular"],
    "distributed_systems": ["Microservices"]
  },
  "tooling": {
    "vcs": ["Git", "GitHub"],
    "build": ["Gradle", "Maven", "npm", "pnpm", "pip"]
  }
}
```

---

## `$ workflow`

```shell
#!/usr/bin/env bash
# how every project gets built

understand   # the real problem and its constraints, before picking any technology
architect    # components, boundaries, data flow, interfaces, storage
build        # implement, test, debug, justify each technical decision
evolve       # release, find the limits, fix what breaks, repeat
```

```kotlin
fun solve(problem: Problem): Solution {
    val constraints = understand(problem)
    val design = design(constraints)

    return build(design)
        .test()
        .fix()
        .repeatUntilItWorks()
}
```

---

## `$ now.yaml`

```yaml
currently:
  building:
    - Vaultar        # Android document vault
    - Docxion        # open-source Office viewer
    - Vaultar Web    # Next.js product website
  learning:
    - advanced system design
    - container orchestration
    - distributed systems
  looking_for:
    - open source collaboration
    - interesting problems with more than one layer
```

---

## `$ other_repos`

| Repository | Description | Language |
|---|---|---|
| [**Terminal-Local-Chat**](https://github.com/gabrielmjr/Terminal-Local-Chat) | Terminal messenger between devices over hotspot/Wi-Fi | Java |
| [**github-follow-manager**](https://github.com/gabrielmjr/github-follow-manager) | Track followers/following and manage reciprocity | Python |
| [**Physic**](https://github.com/gabrielmjr/Physic) | Java library for physics calculations and conversions | Java |

---

## `$ github_activity`

<div align="center">
  <img src="https://github-readme-stats.vercel.app/api?username=gabrielmjr&show_icons=true&theme=github_dark&hide_border=true&rank_icon=github" height="170" alt="GitHub stats" />
  <img src="https://github-readme-stats.vercel.app/api/top-langs/?username=gabrielmjr&layout=compact&theme=github_dark&hide_border=true" height="170" alt="Top languages" />
  <br />
  <img src="https://streak-stats.demolab.com?user=gabrielmjr&theme=github-dark-blue&hide_border=true" width="70%" alt="Contribution streak" />
</div>

<sub>Cards are generated by third-party services; availability depends on them, not on me.</sub>

---

## `$ connect`

```json
{
  "portfolio": "https://gabrielmjr.vercel.app",
  "linkedin": "https://www.linkedin.com/in/gabrielmjr05",
  "vaultar": "https://vaultar.web.app",
  "languages_spoken": { "Portuguese": "native", "English": "intermediate" }
}
```

<div align="center">

<a href="https://gabrielmjr.vercel.app"><img src="https://img.shields.io/badge/Have_a_problem_to_solve%3F-Let's_talk-58A6FF?style=for-the-badge" alt="Let's talk" /></a>

<br /><br />

`$ git commit -m "keep building"`

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=100&section=footer" width="100%" alt="" />

</div>
