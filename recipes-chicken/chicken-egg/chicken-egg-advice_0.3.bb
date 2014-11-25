SECTION = "devel/chicken"
DESCRIPTION = "advise' functionality"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://advice.meta;md5=95e1c72cb6fe38133111365d604b7e86"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "5f9a02574cb042017c09a786459f8628"
SRC_URI[sha256sum] = "a0fde8bac9b95272cbd49b31689d575bbdb55cb864fab8143b6123f2dfa9e930"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
