WorldPoint failed = new WorldPoint(3089, 3264, 0); //L1
WorldPoint fix = new WorldPoint(3104, 3273, 0); //L1
WorldPoint currentLocation = client.getLocalPlayer().getWorldLocation();
if (client.getEnergy() >= 20) {
    v.getWalking().turnRunningOn();
}
else if (v.getLocalPlayer().hasAnimation(-1) && !v.getWalking().isRunning() && client.getLocalPlayer().getPoseAnimation() != 762) {
    if(v.getGroundItem().findNearestRandomized(5, 5, 11849) != null) {
        v.getGroundItem().take(11849);
    } 
   else if (currentLocation.equals(failed) && !currentLocation.equals(fix) && v.getLocalPlayer().hasAnimation(-1) && !v.getWalking().isMoving()){
        currentLocation = client.getLocalPlayer().getWorldLocation();
        v.getWalking().walk(fix);
    }
} else {
        WorldPoint currentPoint = client.getLocalPlayer().getWorldLocation();
        if (v.getWalking().nearEntity(Entity.GAME, 595, 3)) {
            DecorativeObject decorativeObject = (new DecorativeObjectQuery()).idEquals(new int[]{11404}).result(client).nearestTo(client.getLocalPlayer());
            if (decorativeObject != null) {
                WorldPoint decorWorldPoint = WorldPoint.fromLocal(client, decorativeObject.getX(), decorativeObject.getY(), decorativeObject.getPlane());
                int decorSceneX = decorWorldPoint.getX() - client.getBaseX();
                int decorSceneY = decorWorldPoint.getY() - client.getBaseY();
                v.invoke("Climb", "<col=ffff>Rough wall", 11404, 3, decorSceneX, decorSceneY, false);
            }
        } else if (v.getWalking().nearEntity(Entity.GROUND, 11405, 5)) {
            GroundObject groundObject = (new GroundObjectQuery()).idEquals(new int[]{11405}).result(client).nearestTo(client.getLocalPlayer());
            if (groundObject != null) {
                WorldPoint groundWorldPoint = WorldPoint.fromLocal(client, groundObject.getX(), groundObject.getY(), groundObject.getPlane());
                int groundSceneX = groundWorldPoint.getX() - client.getBaseX();
                int groundSceneY = groundWorldPoint.getY() - client.getBaseY();
                v.invoke("Cross", "<col=ffff>Tightrope", 11405, 3, groundSceneX, groundSceneY, false);
            }

        } else if (v.getWalking().nearEntity(Entity.GROUND, 11406, 5)) {
            GroundObject groundObject = (new GroundObjectQuery()).idEquals(new int[]{11406}).result(client).nearestTo(client.getLocalPlayer());
            if (groundObject != null) {
                WorldPoint groundWorldPoint = WorldPoint.fromLocal(client, groundObject.getX(), groundObject.getY(), groundObject.getPlane());
                int groundSceneX = groundWorldPoint.getX() - client.getBaseX();
                int groundSceneY = groundWorldPoint.getY() - client.getBaseY();
                v.invoke("Cross", "<col=ffff>Tightrope", 11406, 3, groundSceneX, groundSceneY, false);
            }
        } else if (v.getWalking().nearEntity(Entity.GAME, 11430, 5) && currentPoint.getY() != 3261) {
            GameObject gameObject = v.getGameObject().findNearest(11430);
            if (gameObject != null) {
                int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
                int gameObjectSceneY = gameObject.getSceneMaxLocation().getY();
                v.invoke("Balance", "<col=ffff>Narrow wall", 11430, 3, gameObjectSceneX, gameObjectSceneY, false);
            }

        } else if (v.getWalking().nearEntity(Entity.GAME, 11630, 5) && currentPoint.getY() != 3255) {
            GameObject gameObject = v.getGameObject().findNearest(11630);
            if (gameObject != null) {
                int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
                int gameObjectSceneY = gameObject.getSceneMaxLocation().getY();
                v.invoke("Jump-up", "<col=ffff>Wall", 11630, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
        } else if (v.getWalking().nearEntity(Entity.GAME, 11631, 7) && currentPoint.getY() != 3256) {
            GameObject gameObject = v.getGameObject().findNearest(11631);
            if (gameObject != null) {
                int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
                int gameObjectSceneY = gameObject.getSceneMaxLocation().getY();
                v.invoke("Jump", "<col=ffff>Gap", 11631, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
        } else if (v.getWalking().nearEntity(Entity.GAME, 11632, 7)) {
            GameObject gameObject = v.getGameObject().findNearest(11632);
            if (gameObject != null) {
                int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
                int gameObjectSceneY = gameObject.getSceneMaxLocation().getY();
                v.invoke("Climb-down", "<col=ffff>Crate", 11632, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
        } else if (v.getWalking().nearEntity(Entity.GAME, 358, 3)) {
            v.getWalking().walk(3103, 3278);
        }
    }
