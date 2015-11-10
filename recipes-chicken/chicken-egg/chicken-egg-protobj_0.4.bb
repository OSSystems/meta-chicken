SECTION = "devel/chicken"
DESCRIPTION = "A prototype-delegation object model"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://protobj.meta;md5=ce585f8a9b8e96bc9ee58efa02ca69d6"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/protobj/protobj-${PV}.tar.gz"

SRC_URI[md5sum] = "7166d2cf666531ea4baec4a2a467acec"
SRC_URI[sha256sum] = "615375742e69b954ea4e33d39961d740e268572bf7f117dcb23e497d16dedd57"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
