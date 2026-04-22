# Design System Document: Deep-Sea Immersion

## 1. Overview & Creative North Star: "The Bioluminescent Abyss"
The North Star for this design system is **The Bioluminescent Abyss**. We are moving away from the "flat web" and into a volumetric, liquid space. The experience of 'Franca, la Ballena' should feel like diving: where light filters from above, elements float with organic buoyancy, and the UI reveals itself through glow rather than rigid structure.

To break the "template" look, we employ **Fluid Asymmetry**. Avoid perfectly centered, static grids. Use overlapping elements—like a whale illustration breaking the container of a text block—to create a sense of scale and movement. The contrast between the massive `display-lg` typography and the delicate `label-sm` metadata creates a high-end editorial rhythm that feels premium and intentional.

---

## 2. Colors: The Oceanic Spectrum
Our palette mimics the transition from the sunlit surface to the deep midnight zones.

*   **Primary & Bioluminescence:** `primary` (#00daf3) is our light source. Use it sparingly for interactive elements and key highlights. It should feel like it’s "glowing" against the dark `background`.
*   **Secondary & Earth:** `secondary` (#d3c5aa) represents the sandy floor and Franca’s organic nature. It provides a tactile, human warmth to the cold deep-sea blues.
*   **Tertiary & Life:** `tertiary` (#ffb3b1) is our coral accent. Use it for environmental awareness cues or "soft" alerts.

### The Rules of the Deep
*   **The "No-Line" Rule:** Never use 1px solid borders to separate sections. Transition from `surface` to `surface-container-low` to define a new content area. Let the color shift tell the story, not a line.
*   **Surface Hierarchy & Nesting:** Treat the UI as layers of water. 
    *   Base layer: `surface` (#011523).
    *   Floating cards: `surface-container` (#0c2130).
    *   Interactive pop-overs: `surface-container-high` (#182c3b).
*   **The "Glass & Gradient" Rule:** All floating modals must use Glassmorphism. Apply `surface-variant` at 60% opacity with a `24px` backdrop-blur. 
*   **Signature Textures:** Use a linear gradient from `primary-container` to `surface` at a 155-degree angle for hero backgrounds to simulate light fading as it travels deeper into the ocean.

---

## 3. Typography: Fluid & Modern
We use a pairing of **Plus Jakarta Sans** and **Be Vietnam Pro** to balance friendly approachability with high-fidelity precision.

*   **Display & Headlines (Plus Jakarta Sans):** These are our "Impact" layers. The rounded terminals of Jakarta Sans echo the fluid movement of water. Use `display-lg` (3.5rem) with tight letter-spacing (-0.02em) for hero titles to evoke the massive presence of a whale.
*   **Body & Titles (Be Vietnam Pro):** This face provides exceptional legibility in dark-mode environments. Use `body-lg` for narrative storytelling.
*   **Labeling:** `label-sm` should always be in uppercase with a `0.05em` letter-spacing to provide a sophisticated, technical contrast to the friendly headlines.

---

## 4. Elevation & Depth: Tonal Layering
In the deep sea, there are no hard shadows. Light is ambient and diffused.

*   **The Layering Principle:** Elevate content by moving "up" the container scale. A `surface-container-highest` card placed on a `surface-dim` background creates a natural focal point without a single drop shadow.
*   **Ambient Shadows:** For high-priority floating actions, use a `primary` tinted shadow: `0 20px 40px rgba(0, 218, 243, 0.08)`. This mimics the bioluminescent glow reflecting off nearby surfaces.
*   **The "Ghost Border" Fallback:** If a boundary is strictly required (e.g., input fields), use `outline-variant` at 15% opacity. It should be felt, not seen.
*   **Glassmorphism Depth:** To create a "cockpit" feel for Franca's adventure, use nested glass containers. An inner `surface-bright` glass element (20% opacity) inside an outer `surface-container` glass element creates a rich, multi-dimensional stack.

---

## 5. Components: The Adventure Kit

### Buttons
*   **Primary:** A pill-shaped (`full` roundedness) button using the `primary` color. Interaction should trigger a subtle `primary-fixed` inner glow.
*   **Secondary:** Glass-style. `surface-variant` at 20% opacity with a `primary` "Ghost Border."
*   **Tertiary:** No background. `primary` text with an animated underline that expands from the center on hover.

### Cards & Lists
*   **Anti-Divider Rule:** Absolute prohibition of horizontal rules (`<hr>`). Use `40px` of vertical white space or a subtle shift to `surface-container-low` to distinguish list items.
*   **Interactive Cards:** On hover, a card should scale by 1.02 and shift from `surface-container` to `surface-container-high`.

### Input Fields
*   **The "Water Surface" Input:** Use a bottom-only border (2px) of `outline-variant` at 20%. When focused, the border transforms into a `primary` gradient "glow" that bleeds slightly upward.

### Specialized Components: "The Oxygen Meter"
*   **Progress Indicators:** For environmental awareness stats, use thick, rounded tracks (`surface-container-highest`) with a `primary` to `tertiary` gradient fill, simulating a biological life-bar.

---

## 6. Do’s and Don’ts

### Do:
*   **Do** use asymmetrical margins (e.g., 8% left, 12% right) to create a sense of organic movement.
*   **Do** use large-scale imagery of water textures and bioluminescence that overlaps text.
*   **Do** ensure all interactive elements have a "glow" state rather than just a color change.

### Don’t:
*   **Don't** use pure black (#000000) or pure white (#FFFFFF). Use the provided `surface` and `on-surface` tokens to maintain the oceanic tint.
*   **Don't** use sharp corners. Every element must use at least the `md` (1.5rem) roundedness scale to feel "eroded" by water.
*   **Don't** clutter the screen. In the deep sea, space is infinite. Give every element "room to breathe."

### Accessibility Note
While we are using a dark, immersive theme, ensure that all text on `surface` backgrounds maintains a contrast ratio of at least 4.5:1 by using the `on-surface` (#d0e5f9) and `primary` (#00daf3) tokens diligently.