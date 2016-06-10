include recipes-chicken/images/chicken-test-image.bb

IMAGE_FEATURES += "dev-pkgs \
                   tools-sdk \
                   tools-debug \
                   tools-profile \
                   tools-testapps \
                   ssh-server-openssh"
