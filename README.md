# Lost-Found-Marketplace
A digital noticeboard for lost items; owners and finders connect directly.

- Core features  
  - Post “Lost” or “Found” items with photos, location, brief description  
  - In-app chat to negotiate returns  
  - Auto-expiry of posts after 7 days  
- Architecture  
  - UI: Card-based feed + filters (category, date)  
  - Backend: Firebase Storage (images) + Firestore (posts)  
  - Notifications: FCM to alert when a match appears  
- Why it’s unique  
  - Cuts through cluttered WhatsApp groups; centralizes campus lost-found  
  - Roles: image upload & storage, chat & notifications, feed + filtering
