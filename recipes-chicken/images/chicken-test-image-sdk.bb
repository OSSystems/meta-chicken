include recipes-chicken/images/chicken-test-image.bb

IMAGE_FEATURES += "tools-sdk dev-pkgs tools-debug"

# Includes all native eggs inside of the toolchain
TOOLCHAIN_HOST_TASK_append = " ${ALL_NATIVESDK_CHICKEN_EGG_RECIPES}"
