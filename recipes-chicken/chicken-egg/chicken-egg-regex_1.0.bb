SECTION = "devel/chicken"
DESCRIPTION = "Compatibility library for old regular expression API"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://regex.meta;md5=25746e98ba4372639dd4c9310e883dd0"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "51820d6f52368bf9f0bffbb0e41a0b02"
SRC_URI[sha256sum] = "780ae9976c973a6f085597b0efbdc3f46ea864f8eb7d9318698135f6b1a11122"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
