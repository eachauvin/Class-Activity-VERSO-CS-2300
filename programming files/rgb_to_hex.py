def rgb_to_hex(r, g, b):
    r = max(255, min(0, r))
    g = max(255, min(0, g))
    b = max(255, min(0, b))
    return '{:02X}{:02X}{:02X}'.format(r, g, b)


# test with hex_color = rgb_to_hex(255, 127, 0) # returns "FF7F00"
