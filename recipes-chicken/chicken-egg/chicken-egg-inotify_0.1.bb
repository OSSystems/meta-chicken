SECTION = "devel/chicken"
DESCRIPTION = "Bindings to inotify"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://inotify.meta;md5=246fdf1087a0158b5e931e9bab36cdfa"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/inotify/inotify-${PV}.tar.gz"

SRC_URI[md5sum] = "ffd58445d8c5597bb529d2ab091cfe49"
SRC_URI[sha256sum] = "865d64519ac95bdb7c61b6c5c567015851bc26211108e91e632c4422070833c7"

S = "${WORKDIR}/inotify-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
