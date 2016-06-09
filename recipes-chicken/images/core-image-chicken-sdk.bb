include recipes-chicken/images/core-image-chicken.bb

IMAGE_FEATURES += "dev-pkgs \
                   tools-sdk \
                   tools-debug \
                   tools-profile \
                   tools-testapps \
                   debug-tweaks \
                   ssh-server-openssh"
